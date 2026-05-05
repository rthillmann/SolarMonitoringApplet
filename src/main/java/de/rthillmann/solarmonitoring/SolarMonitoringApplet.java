/**
 * SolarMonitoringApplet
 *
 * Show actual yield data from OpenDTU-server as Applet-window, use kind of seven-segment-display to show values.
 * Following colors for 7-segment-digits can be used:
 * RED, GREEN, BLUE, CYAN, YELLOW, WHITE
 *
 * @author    Rolf Thillmann
 * @see        <a href="https://github.com/rthillmann/SolarMonitoringApplet"> github-repository </a>
 * @since
 * date      2026-04-30
 * @links <a href="https://www.muquit.com/muquit/software/jdgclock/jdgclock.html"></a> - from this side the image with the digits
 * has been used as base for generating the digit-images in resources/DigitImages-folder

 */

package de.rthillmann.solarmonitoring;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;


public class SolarMonitoringApplet extends JFrame {
	
	private static final String TITLE = "Solar Plant Yield Monitoring - OpenDTU";

	private static final Color BG_COLOR = Color.LIGHT_GRAY;	// define yield data panels background color

	private final ArrayList<YieldPanel> yieldPanels = new ArrayList<>(); // to store list of solar plants to monitor given with cmd line parms



	/**
	 * Constructor
	 * @param args command line args:
	 *             --name={} name to show as panel titel
	 *             --color={RED|GREEN|BLUE|CYAN|YELLOW|WHITE} available colors for 7-segment digits
	 *             --refresh={} time in seconds to get actual data - ToDo min refresh time
	 *             {url} url to the OpenDTU server
	 *
	 *             multiple solar plants may be given as parms, e.g:
	 * 			      --name=garden --color=CYAN --refresh=30 https://192.168.178.56 --name=street --color=RED --refresh=40 https://192.168.178.99
	 * 			   parms with leading -- may be omitted and default will be used, as --name="", --color="CYAN", --refresh=30
	 * @throws MalformedURLException
	 * @throws URISyntaxException
	 */
	public SolarMonitoringApplet(String[] args) throws MalformedURLException, URISyntaxException {

		parseAndValidateArg(args);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultLookAndFeelDecorated(true);
		setTitle(TITLE);

		createGui();
    }



	/**
	 * create necessary gui components
	 */
	private void createGui() {

		// Using GridBagLayout to enable simple adding of multiple power plant monitoring lines
		Container pane = this.getContentPane();
		pane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		//c.fill = GridBagConstraints.HORIZONTAL;
		c.fill = GridBagConstraints.NONE;
		c.anchor = GridBagConstraints.LINE_START;

		// first row
		c.gridy = 0;
		c.gridx = 0;

		for (YieldPanel yieldPanel : yieldPanels) {

			if (c.gridy == 0) {	// first row
				c.insets = new Insets(10,10,10, 10); // top padding - first row
				pane.add(yieldPanel, c);
			} else {			// additional rows
				c.insets = new Insets(0,10,10, 10);  // no top padding - further rows
				pane.add(yieldPanel, c);
			}
			c.gridy++;

		}

		this.pack();
		setVisible(true);

	}



	/**
	 * print usage messages to stdout and leave program with exit-code 8
	 */
	private static void printUsageAndExit() {

		System.out.println("Usage: java -jar SolarMonitoringApplet [--name={name}] [--refresh={30}] [--color={RED|GREEN|BLUE|CYAN|YELLOW|WHITE}] {url}");
		System.out.println("   url - a valid URL to an OpenDTU-server has to be specified .");
		System.out.println("   --name, --refresh, --color - if an optional parm is missing, a default value will be used,");
		System.out.println("   --name='', --refresh=30, --color=CYAN");
		System.out.println();
		System.out.println("Example: java -jar SolarMonitoringApplet --name=Garden --refresh=40 --color=RED http://192.168.1.1");
		System.out.println();
		System.exit(8);

	}



	/**
	 * try to create an URL for OpenDTU-server from given command line args
	 * @param args - command line arguments to parse for URL-String to OpenDTU-server
	 * @return an URL-object for the OpenDTU-server
	 * @throws MalformedURLException malformed URL
	 * @throws URISyntaxException string could not be parsed as a URI reference
	 */
	private void parseAndValidateArg(String[] args) throws MalformedURLException, URISyntaxException, IllegalArgumentException {

		if (args == null || args.length == 0) {
			printUsageAndExit();
		}

		// multiple solar plants may be given as parms, e.g:
		// --name=garden --color=CYAN --refresh=30 https://192.168.178.56 --name="street" --color=RED --refresh=40 https://192.168.178.99

		String name = "";
		DigitIcons.COLORS digitColor = DigitIcons.COLORS.CYAN;	// set default color
		int refreshInterval = 30;							// set default refresh interval

		try {
			for (String val : args) {

				if (val.startsWith("--name")) {

					name = val.substring(val.indexOf("=") + 1);

				} else if (val.startsWith("--refresh")) {

					refreshInterval = Integer.parseInt(val.substring(val.indexOf("=") + 1));

				} else if (val.startsWith("--color")) {

					switch (val) {
						case "--color=RED":
							digitColor = DigitIcons.COLORS.RED;
							break;
						case "--color=GREEN":
							digitColor = DigitIcons.COLORS.GREEN;
							break;
						case "--color=BLUE":
							digitColor = DigitIcons.COLORS.BLUE;
							break;
						case "--color=CYAN":
							digitColor = DigitIcons.COLORS.CYAN;
							break;
						case "--color=YELLOW":
							digitColor = DigitIcons.COLORS.YELLOW;
							break;
						case "--color=WHITE":
							digitColor = DigitIcons.COLORS.WHITE;
							break;

					}
				} else {

					this.yieldPanels.add(new YieldPanel(name, new URI(val).toURL(), BG_COLOR, digitColor, refreshInterval));

					// add to list of solar plants to show
					// reset to defaults, if some parms are omitted
					name = "";
					digitColor = DigitIcons.COLORS.CYAN;
					refreshInterval = 30;

				}
			}
		} catch (IllegalArgumentException e) {
			printUsageAndExit();
		}

	}



	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {
            try {
                new SolarMonitoringApplet(args);
            } catch (MalformedURLException | URISyntaxException e) {
                throw new RuntimeException(e);
            }
		});
	}

}