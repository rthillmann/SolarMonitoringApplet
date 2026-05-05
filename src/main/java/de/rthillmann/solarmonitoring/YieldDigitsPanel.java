package de.rthillmann.solarmonitoring;

import javax.swing.*;
import java.awt.*;

/**
 * class to generate panel with yield data using digit-icons from DigitIcons-class.
 * This panel is used as part in YieldPanel to show data for YieldTotal, YieldDay and Power
 *
 * @author    Rolf Thillmann - rthillmann@t-online.de
 * @version   1.0.0
 * date       2026-04-30
 */
public class YieldDigitsPanel extends JPanel{

    private final JPanel valuePanel;
    private final GridBagConstraints c = new GridBagConstraints();
    private final DigitIcons.COLORS color;

    private final JLabel yieldUnit = new JLabel();


    public YieldDigitsPanel(String label, DigitIcons.COLORS color, Color bgColor) {

        this.color = color;
        JLabel yieldLabel = new JLabel(label);

        this.setLayout(new FlowLayout());
        this.setBorder(BorderFactory.createLoweredBevelBorder());
        this.setBackground(bgColor);

        yieldLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        valuePanel = new JPanel(new GridBagLayout()); // 0 horizontal and vertical gaps.
        valuePanel.setBackground(bgColor);

        yieldUnit.setHorizontalAlignment(SwingConstants.LEFT)	;


        this.add(yieldLabel);
        this.add(valuePanel);
        this.add(yieldUnit);
        yieldLabel.revalidate();    // ToDo remove?
        yieldUnit.revalidate();    // ToDo remove?
        this.setVisible(true);

    }



    public synchronized void updateYieldDigits(YieldData data) {

        String[] result = data.value().split("(?<=.)");

        yieldUnit.setText(data.unit());     // Maybe unit has changed
                                            // decimals not used here
        valuePanel.removeAll();             // remove all digits from value panel

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 0);  //top padding
        c.gridy = 0;

        for (int index = 0; index < result.length; index++) {

            //System.out.println("result[index]: " + result[index]);
            JLabel digitLabel = new JLabel();
            digitLabel.setIcon(DigitIcons.getIcon(result[index], this.color));

            c.gridx = index;
            valuePanel.add(digitLabel, c);
        }

    }

}