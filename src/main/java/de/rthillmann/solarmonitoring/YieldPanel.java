package de.rthillmann.solarmonitoring;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * This panel contains and shows data for one solar power plant, containing "YieldTotal", "YieldDay" and "Power".
 * The values are displayed as old style 7-segment digits in selectable color.
 * Data from OpenDTU are retrieved periodically and values are updated with background ScheduledThreadPoolExecutor.
 *
 * @author    Rolf Thillmann - rthillmann@t-online.de
 * @version   1.0.0
 * date       2026-04-30
 */
public class YieldPanel extends JPanel {

    private static final String LIVEDATA_STATUS = "/api/livedata/status";

    private final URL openDtuServerURL;

    // OpenDTU JSON member name for accessing data
    private final String DTU_JSON_MEMBER_TOTAL =       "total";
    private final String DTU_JSON_MEMBER_YIELD_DAY =   "YieldDay";
    private final String DTU_JSON_MEMBER_YIELD_TOTAL = "YieldTotal";
    private final String DTU_JSON_MEMBER_POWER =       "Power";

    // this panel consists of following three panels
    private final YieldDigitsPanel yieldTotalPanel;
    private final YieldDigitsPanel yieldDayPanel;
    private final YieldDigitsPanel powerPanel;



    /**
     * create the solar monitoring panel with information for total yield, daily yield and actual generated power
     *
     * @param name to be shown as titled border
     * @param openDtuServerURL url to OpenDTU server to retrieve yield-data from
     * @param bgColor background color for panel with yiedld data
     * @param digitColor color to use for display 7-segment-digits
     * @param refreshInterval time in seconds to wait before trying to retrieve new yield data
     */
    public YieldPanel(String name, URL openDtuServerURL, Color bgColor, DigitIcons.COLORS digitColor, int refreshInterval) {

        this.openDtuServerURL = openDtuServerURL;

        this.setLayout(new FlowLayout());
        this.setBorder(BorderFactory.createTitledBorder(name));
        this.setBackground(bgColor);

        yieldTotalPanel = new YieldDigitsPanel(DTU_JSON_MEMBER_YIELD_TOTAL, digitColor, bgColor);
        yieldDayPanel = new YieldDigitsPanel(DTU_JSON_MEMBER_YIELD_DAY, digitColor, bgColor);
        powerPanel = new YieldDigitsPanel(DTU_JSON_MEMBER_POWER, digitColor, bgColor);

        updateYieldData();  // try to get yield data before first display

        this.add(yieldTotalPanel);
        this.add(yieldDayPanel);
        this.add(powerPanel);

        SwingUtilities.invokeLater(() -> {

            ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
            executor.scheduleAtFixedRate(this::updateYieldData, 10, refreshInterval, TimeUnit.SECONDS);
        });

        this.setVisible(true);
    }



    /**
     * retrieve actual yield data and refresh gui components.
     */
    private void updateYieldData() {

        YieldDataSummary yieldData = retrieveYieldData();

        if (yieldData != null) {
            yieldTotalPanel.updateYieldDigits(yieldData.yieldTotal());
            yieldTotalPanel.updateUI();

            yieldDayPanel.updateYieldDigits(yieldData.yieldDay());
            yieldDayPanel.updateUI();

            powerPanel.updateYieldDigits(yieldData.power());
            powerPanel.updateUI();
        }

    }



    /**
     * Try to retrieve yield data from OpenDTU server
     * The retrieved data in Json-format will pe parsed and a record of type YieldDataSummary will be created and returned.
     *
     * @return a record with the actual yield data or null, if no data can be retrieved.
     */
    private YieldDataSummary retrieveYieldData() {

        try {
            URL requestUrl = new URI(this.openDtuServerURL.getProtocol(), this.openDtuServerURL.getHost(), LIVEDATA_STATUS, null, null).toURL();
            JsonElement root = getJsonFromUrl(requestUrl);

            if (root == null) return null;

            if (root.isJsonObject()) {

                JsonObject rootobj = root.getAsJsonObject(); // Maybe an array, may be an object.

                // First get Yieldata from "total"-member
                JsonObject total = rootobj.getAsJsonObject(DTU_JSON_MEMBER_TOTAL);

                return createYieldDataFromJsonObject(total);

            }
        } catch (MalformedURLException | URISyntaxException e) {
            throw new RuntimeException(e);
        }

        return null;

    }



    /**
     * Try to get yield-data from OpenDTU-server in Json-format.
     *
     * @param url the url to the opendtu server, e.g. "http://www.opendtu-server.com/api/livedata/status"
     * @return the retrieved yield-data in Json-format
     */
    private JsonElement getJsonFromUrl(URL url) {

        try {

            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.setConnectTimeout(30000);
            request.connect();

            BufferedReader in = new BufferedReader(new InputStreamReader((InputStream) request.getContent()));
            JsonElement parsedInput = JsonParser.parseReader(in);
            in.close();

            return parsedInput;

        } catch (Exception ex) {

            System.out.println(ex.getMessage());

        }
        return null;

    }



    /**
     * Parse Json-data and return a record of type YieldDataSummary.
     *
     * @param dc the Json-data from part "total" retrieved from OpenDTU-server
     * @return a record with the actual yield data for "YieldTotal", "YieldDay" and "Power".
     */
    private YieldDataSummary createYieldDataFromJsonObject(JsonObject dc){

        String yieldDayValue = dc.getAsJsonObject(DTU_JSON_MEMBER_YIELD_DAY).get("v").getAsString();
        String yieldDayUnit  = dc.getAsJsonObject(DTU_JSON_MEMBER_YIELD_DAY).get("u").getAsString();
        String yieldDayDecimals = dc.getAsJsonObject(DTU_JSON_MEMBER_YIELD_DAY).get("d").getAsString();

        String yieldTotalValue = dc.getAsJsonObject(DTU_JSON_MEMBER_YIELD_TOTAL).get("v").getAsString();
        String yieldTotalUnit  = dc.getAsJsonObject(DTU_JSON_MEMBER_YIELD_TOTAL).get("u").getAsString();
        String yieldTotalDecimals = dc.getAsJsonObject(DTU_JSON_MEMBER_YIELD_TOTAL).get("d").getAsString();

        String yieldPowerValue = dc.getAsJsonObject(DTU_JSON_MEMBER_POWER).get("v").getAsString();
        String yieldPowerUnit  = dc.getAsJsonObject(DTU_JSON_MEMBER_POWER).get("u").getAsString();
        String yieldPowerDecimals = dc.getAsJsonObject(DTU_JSON_MEMBER_POWER).get("d").getAsString();

        return new YieldDataSummary(
                new YieldData(DTU_JSON_MEMBER_YIELD_TOTAL, yieldTotalValue, yieldTotalUnit, yieldTotalDecimals),
                new YieldData(DTU_JSON_MEMBER_YIELD_DAY, yieldDayValue, yieldDayUnit, yieldDayDecimals),
                new YieldData(DTU_JSON_MEMBER_YIELD_TOTAL, yieldPowerValue, yieldPowerUnit, yieldPowerDecimals));

    }

}