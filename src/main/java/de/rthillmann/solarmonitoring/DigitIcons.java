package de.rthillmann.solarmonitoring;

import javax.swing.*;
import java.net.MalformedURLException;
import java.nio.file.Paths;

/**
 * class to load ImageIcons for DIGITS out of:
 * "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ":", ".", ","
 * <p>
 * The ImageIcons can be retrieved by one of the following methods:
 * - predefined static values, like DigitIcons.DIGIT_0_RED
 * - or using getIcon(DIGITS digit, COLORS color) with usage if DIGITS- and COLORS-enumeration
 * - or using getIcon(String digit, COLORS color) with usage of following Strings for digit
 *      "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ":", ".", "," and COLORS-enumeration
 *
 * @author    Rolf Thillmann - rthillmann@t-online.de
 * @version   1.0.0
 * date       2026-04-30
 */
public class DigitIcons {

    public enum DIGITS {
        DIGIT_0,
        DIGIT_1,
        DIGIT_2,
        DIGIT_3,
        DIGIT_4,
        DIGIT_5,
        DIGIT_6,
        DIGIT_7,
        DIGIT_8,
        DIGIT_9,
        COLON,
        POINT,
        COMMA
    }

    public enum COLORS {
        RED,
        GREEN,
        BLUE,
        CYAN,
        YELLOW,
        WHITE
    }


    public static ImageIcon DIGIT_0_RED;
    public static ImageIcon DIGIT_1_RED;
    public static ImageIcon DIGIT_2_RED;
    public static ImageIcon DIGIT_3_RED;
    public static ImageIcon DIGIT_4_RED;
    public static ImageIcon DIGIT_5_RED;
    public static ImageIcon DIGIT_6_RED;
    public static ImageIcon DIGIT_7_RED;
    public static ImageIcon DIGIT_8_RED;
    public static ImageIcon DIGIT_9_RED;
    public static ImageIcon COLON_RED;
    public static ImageIcon POINT_RED;
    public static ImageIcon COMMA_RED;


    public static ImageIcon DIGIT_0_GREEN;
    public static ImageIcon DIGIT_1_GREEN;
    public static ImageIcon DIGIT_2_GREEN;
    public static ImageIcon DIGIT_3_GREEN;
    public static ImageIcon DIGIT_4_GREEN;
    public static ImageIcon DIGIT_5_GREEN;
    public static ImageIcon DIGIT_6_GREEN;
    public static ImageIcon DIGIT_7_GREEN;
    public static ImageIcon DIGIT_8_GREEN;
    public static ImageIcon DIGIT_9_GREEN;
    public static ImageIcon COLON_GREEN;
    public static ImageIcon POINT_GREEN;
    public static ImageIcon COMMA_GREEN;


    public static ImageIcon DIGIT_0_BLUE;
    public static ImageIcon DIGIT_1_BLUE;
    public static ImageIcon DIGIT_2_BLUE;
    public static ImageIcon DIGIT_3_BLUE;
    public static ImageIcon DIGIT_4_BLUE;
    public static ImageIcon DIGIT_5_BLUE;
    public static ImageIcon DIGIT_6_BLUE;
    public static ImageIcon DIGIT_7_BLUE;
    public static ImageIcon DIGIT_8_BLUE;
    public static ImageIcon DIGIT_9_BLUE;
    public static ImageIcon COLON_BLUE;
    public static ImageIcon POINT_BLUE;
    public static ImageIcon COMMA_BLUE;


    public static ImageIcon DIGIT_0_CYAN;
    public static ImageIcon DIGIT_1_CYAN;
    public static ImageIcon DIGIT_2_CYAN;
    public static ImageIcon DIGIT_3_CYAN;
    public static ImageIcon DIGIT_4_CYAN;
    public static ImageIcon DIGIT_5_CYAN;
    public static ImageIcon DIGIT_6_CYAN;
    public static ImageIcon DIGIT_7_CYAN;
    public static ImageIcon DIGIT_8_CYAN;
    public static ImageIcon DIGIT_9_CYAN;
    public static ImageIcon COLON_CYAN;
    public static ImageIcon POINT_CYAN;
    public static ImageIcon COMMA_CYAN;


    public static ImageIcon DIGIT_0_YELLOW;
    public static ImageIcon DIGIT_1_YELLOW;
    public static ImageIcon DIGIT_2_YELLOW;
    public static ImageIcon DIGIT_3_YELLOW;
    public static ImageIcon DIGIT_4_YELLOW;
    public static ImageIcon DIGIT_5_YELLOW;
    public static ImageIcon DIGIT_6_YELLOW;
    public static ImageIcon DIGIT_7_YELLOW;
    public static ImageIcon DIGIT_8_YELLOW;
    public static ImageIcon DIGIT_9_YELLOW;
    public static ImageIcon COLON_YELLOW;
    public static ImageIcon POINT_YELLOW;
    public static ImageIcon COMMA_YELLOW;


    public static ImageIcon DIGIT_0_WHITE;
    public static ImageIcon DIGIT_1_WHITE;
    public static ImageIcon DIGIT_2_WHITE;
    public static ImageIcon DIGIT_3_WHITE;
    public static ImageIcon DIGIT_4_WHITE;
    public static ImageIcon DIGIT_5_WHITE;
    public static ImageIcon DIGIT_6_WHITE;
    public static ImageIcon DIGIT_7_WHITE;
    public static ImageIcon DIGIT_8_WHITE;
    public static ImageIcon DIGIT_9_WHITE;
    public static ImageIcon COLON_WHITE;
    public static ImageIcon POINT_WHITE;
    public static ImageIcon COMMA_WHITE;


    /*
     * load ImageIcons
     */
    static {
        try {
            DIGIT_1_RED= new ImageIcon(Paths.get("build/resources/main/DigitImages/RED/One_RED.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_2_RED= new ImageIcon(Paths.get("build/resources/main/DigitImages/RED/Two_RED.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_3_RED= new ImageIcon(Paths.get("build/resources/main/DigitImages/RED/Three_RED.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_4_RED= new ImageIcon(Paths.get("build/resources/main/DigitImages/RED/Four_RED.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_5_RED= new ImageIcon(Paths.get("build/resources/main/DigitImages/RED/Five_RED.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_6_RED= new ImageIcon(Paths.get("build/resources/main/DigitImages/RED/Six_RED.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_7_RED= new ImageIcon(Paths.get("build/resources/main/DigitImages/RED/Seven_RED.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_8_RED= new ImageIcon(Paths.get("build/resources/main/DigitImages/RED/Eight_RED.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_9_RED= new ImageIcon(Paths.get("build/resources/main/DigitImages/RED/Nine_RED.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_0_RED= new ImageIcon(Paths.get("build/resources/main/DigitImages/RED/Zero_RED.png").normalize().toAbsolutePath().toUri().toURL());
            COLON_RED= new ImageIcon(Paths.get("build/resources/main/DigitImages/RED/Colon_RED.png").normalize().toAbsolutePath().toUri().toURL());
            POINT_RED= new ImageIcon(Paths.get("build/resources/main/DigitImages/RED/Point_RED.png").normalize().toAbsolutePath().toUri().toURL());
            COMMA_RED= new ImageIcon(Paths.get("build/resources/main/DigitImages/RED/Comma_RED.png").normalize().toAbsolutePath().toUri().toURL());

            DIGIT_1_GREEN= new ImageIcon(Paths.get("build/resources/main/DigitImages/GREEN/One_GREEN.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_2_GREEN= new ImageIcon(Paths.get("build/resources/main/DigitImages/GREEN/Two_GREEN.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_3_GREEN= new ImageIcon(Paths.get("build/resources/main/DigitImages/GREEN/Three_GREEN.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_4_GREEN= new ImageIcon(Paths.get("build/resources/main/DigitImages/GREEN/Four_GREEN.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_5_GREEN= new ImageIcon(Paths.get("build/resources/main/DigitImages/GREEN/Five_GREEN.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_6_GREEN= new ImageIcon(Paths.get("build/resources/main/DigitImages/GREEN/Six_GREEN.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_7_GREEN= new ImageIcon(Paths.get("build/resources/main/DigitImages/GREEN/Seven_GREEN.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_8_GREEN= new ImageIcon(Paths.get("build/resources/main/DigitImages/GREEN/Eight_GREEN.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_9_GREEN= new ImageIcon(Paths.get("build/resources/main/DigitImages/GREEN/Nine_GREEN.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_0_GREEN= new ImageIcon(Paths.get("build/resources/main/DigitImages/GREEN/Zero_GREEN.png").normalize().toAbsolutePath().toUri().toURL());
            COLON_GREEN= new ImageIcon(Paths.get("build/resources/main/DigitImages/GREEN/Colon_GREEN.png").normalize().toAbsolutePath().toUri().toURL());
            POINT_GREEN= new ImageIcon(Paths.get("build/resources/main/DigitImages/GREEN/Point_GREEN.png").normalize().toAbsolutePath().toUri().toURL());
            COMMA_GREEN= new ImageIcon(Paths.get("build/resources/main/DigitImages/GREEN/Comma_GREEN.png").normalize().toAbsolutePath().toUri().toURL());

            DIGIT_1_BLUE= new ImageIcon(Paths.get("build/resources/main/DigitImages/BLUE/One_BLUE.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_2_BLUE= new ImageIcon(Paths.get("build/resources/main/DigitImages/BLUE/Two_BLUE.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_3_BLUE= new ImageIcon(Paths.get("build/resources/main/DigitImages/BLUE/Three_BLUE.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_4_BLUE= new ImageIcon(Paths.get("build/resources/main/DigitImages/BLUE/Four_BLUE.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_5_BLUE= new ImageIcon(Paths.get("build/resources/main/DigitImages/BLUE/Five_BLUE.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_6_BLUE= new ImageIcon(Paths.get("build/resources/main/DigitImages/BLUE/Six_BLUE.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_7_BLUE= new ImageIcon(Paths.get("build/resources/main/DigitImages/BLUE/Seven_BLUE.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_8_BLUE= new ImageIcon(Paths.get("build/resources/main/DigitImages/BLUE/Eight_BLUE.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_9_BLUE= new ImageIcon(Paths.get("build/resources/main/DigitImages/BLUE/Nine_BLUE.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_0_BLUE= new ImageIcon(Paths.get("build/resources/main/DigitImages/BLUE/Zero_BLUE.png").normalize().toAbsolutePath().toUri().toURL());
            COLON_BLUE= new ImageIcon(Paths.get("build/resources/main/DigitImages/BLUE/Colon_BLUE.png").normalize().toAbsolutePath().toUri().toURL());
            POINT_BLUE= new ImageIcon(Paths.get("build/resources/main/DigitImages/BLUE/Point_BLUE.png").normalize().toAbsolutePath().toUri().toURL());
            COMMA_BLUE= new ImageIcon(Paths.get("build/resources/main/DigitImages/BLUE/Comma_BLUE.png").normalize().toAbsolutePath().toUri().toURL());

            DIGIT_1_CYAN= new ImageIcon(Paths.get("build/resources/main/DigitImages/CYAN/One_CYAN.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_2_CYAN= new ImageIcon(Paths.get("build/resources/main/DigitImages/CYAN/Two_CYAN.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_3_CYAN= new ImageIcon(Paths.get("build/resources/main/DigitImages/CYAN/Three_CYAN.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_4_CYAN= new ImageIcon(Paths.get("build/resources/main/DigitImages/CYAN/Four_CYAN.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_5_CYAN= new ImageIcon(Paths.get("build/resources/main/DigitImages/CYAN/Five_CYAN.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_6_CYAN= new ImageIcon(Paths.get("build/resources/main/DigitImages/CYAN/Six_CYAN.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_7_CYAN= new ImageIcon(Paths.get("build/resources/main/DigitImages/CYAN/Seven_CYAN.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_8_CYAN= new ImageIcon(Paths.get("build/resources/main/DigitImages/CYAN/Eight_CYAN.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_9_CYAN= new ImageIcon(Paths.get("build/resources/main/DigitImages/CYAN/Nine_CYAN.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_0_CYAN= new ImageIcon(Paths.get("build/resources/main/DigitImages/CYAN/Zero_CYAN.png").normalize().toAbsolutePath().toUri().toURL());
            COLON_CYAN= new ImageIcon(Paths.get("build/resources/main/DigitImages/CYAN/Colon_CYAN.png").normalize().toAbsolutePath().toUri().toURL());
            POINT_CYAN= new ImageIcon(Paths.get("build/resources/main/DigitImages/CYAN/Point_CYAN.png").normalize().toAbsolutePath().toUri().toURL());
            COMMA_CYAN= new ImageIcon(Paths.get("build/resources/main/DigitImages/CYAN/Comma_CYAN.png").normalize().toAbsolutePath().toUri().toURL());

            DIGIT_1_YELLOW= new ImageIcon(Paths.get("build/resources/main/DigitImages/YELLOW/One_YELLOW.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_2_YELLOW= new ImageIcon(Paths.get("build/resources/main/DigitImages/YELLOW/Two_YELLOW.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_3_YELLOW= new ImageIcon(Paths.get("build/resources/main/DigitImages/YELLOW/Three_YELLOW.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_4_YELLOW= new ImageIcon(Paths.get("build/resources/main/DigitImages/YELLOW/Four_YELLOW.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_5_YELLOW= new ImageIcon(Paths.get("build/resources/main/DigitImages/YELLOW/Five_YELLOW.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_6_YELLOW= new ImageIcon(Paths.get("build/resources/main/DigitImages/YELLOW/Six_YELLOW.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_7_YELLOW= new ImageIcon(Paths.get("build/resources/main/DigitImages/YELLOW/Seven_YELLOW.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_8_YELLOW= new ImageIcon(Paths.get("build/resources/main/DigitImages/YELLOW/Eight_YELLOW.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_9_YELLOW= new ImageIcon(Paths.get("build/resources/main/DigitImages/YELLOW/Nine_YELLOW.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_0_YELLOW= new ImageIcon(Paths.get("build/resources/main/DigitImages/YELLOW/Zero_YELLOW.png").normalize().toAbsolutePath().toUri().toURL());
            COLON_YELLOW= new ImageIcon(Paths.get("build/resources/main/DigitImages/YELLOW/Colon_YELLOW.png").normalize().toAbsolutePath().toUri().toURL());
            POINT_YELLOW= new ImageIcon(Paths.get("build/resources/main/DigitImages/YELLOW/Point_YELLOW.png").normalize().toAbsolutePath().toUri().toURL());
            COMMA_YELLOW= new ImageIcon(Paths.get("build/resources/main/DigitImages/YELLOW/Comma_YELLOW.png").normalize().toAbsolutePath().toUri().toURL());

            DIGIT_1_WHITE= new ImageIcon(Paths.get("build/resources/main/DigitImages/WHITE/One_WHITE.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_2_WHITE= new ImageIcon(Paths.get("build/resources/main/DigitImages/WHITE/Two_WHITE.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_3_WHITE= new ImageIcon(Paths.get("build/resources/main/DigitImages/WHITE/Three_WHITE.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_4_WHITE= new ImageIcon(Paths.get("build/resources/main/DigitImages/WHITE/Four_WHITE.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_5_WHITE= new ImageIcon(Paths.get("build/resources/main/DigitImages/WHITE/Five_WHITE.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_6_WHITE= new ImageIcon(Paths.get("build/resources/main/DigitImages/WHITE/Six_WHITE.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_7_WHITE= new ImageIcon(Paths.get("build/resources/main/DigitImages/WHITE/Seven_WHITE.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_8_WHITE= new ImageIcon(Paths.get("build/resources/main/DigitImages/WHITE/Eight_WHITE.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_9_WHITE= new ImageIcon(Paths.get("build/resources/main/DigitImages/WHITE/Nine_WHITE.png").normalize().toAbsolutePath().toUri().toURL());
            DIGIT_0_WHITE= new ImageIcon(Paths.get("build/resources/main/DigitImages/WHITE/Zero_WHITE.png").normalize().toAbsolutePath().toUri().toURL());
            COLON_WHITE= new ImageIcon(Paths.get("build/resources/main/DigitImages/WHITE/Colon_WHITE.png").normalize().toAbsolutePath().toUri().toURL());
            POINT_WHITE= new ImageIcon(Paths.get("build/resources/main/DigitImages/WHITE/Point_WHITE.png").normalize().toAbsolutePath().toUri().toURL());
            COMMA_WHITE= new ImageIcon(Paths.get("build/resources/main/DigitImages/WHITE/Comma_WHITE.png").normalize().toAbsolutePath().toUri().toURL());


        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }



    /**
     * get icon from given DIGITS-enumeration
     * @param digit one of DIGITS-enumeration
     * @param color one of COLORS-enumeration
     * @return the digit-icon
     */
    public static ImageIcon getIcon(DIGITS digit, COLORS color) {

        switch (digit) {
            case DIGIT_0:
                return switch (color) {
                    case RED -> DIGIT_0_RED;
                    case GREEN -> DIGIT_0_GREEN;
                    case BLUE -> DIGIT_0_BLUE;
                    case CYAN -> DIGIT_0_CYAN;
                    case YELLOW -> DIGIT_0_YELLOW;
                    case WHITE -> DIGIT_0_WHITE;
                };
            case DIGIT_1:
                return switch (color) {
                    case RED -> DIGIT_1_RED;
                    case GREEN -> DIGIT_1_GREEN;
                    case BLUE -> DIGIT_1_BLUE;
                    case CYAN -> DIGIT_1_CYAN;
                    case YELLOW -> DIGIT_1_YELLOW;
                    case WHITE -> DIGIT_1_WHITE;
                };
            case DIGIT_2:
                return switch (color) {
                    case RED -> DIGIT_2_RED;
                    case GREEN -> DIGIT_2_GREEN;
                    case BLUE -> DIGIT_2_BLUE;
                    case CYAN -> DIGIT_2_CYAN;
                    case YELLOW -> DIGIT_2_YELLOW;
                    case WHITE -> DIGIT_2_WHITE;
                };
            case DIGIT_3:
                return switch (color) {
                    case RED -> DIGIT_3_RED;
                    case GREEN -> DIGIT_3_GREEN;
                    case BLUE -> DIGIT_3_BLUE;
                    case CYAN -> DIGIT_3_CYAN;
                    case YELLOW -> DIGIT_3_YELLOW;
                    case WHITE -> DIGIT_3_WHITE;
                };
            case DIGIT_4:
                return switch (color) {
                    case RED -> DIGIT_4_RED;
                    case GREEN -> DIGIT_4_GREEN;
                    case BLUE -> DIGIT_4_BLUE;
                    case CYAN -> DIGIT_4_CYAN;
                    case YELLOW -> DIGIT_4_YELLOW;
                    case WHITE -> DIGIT_4_WHITE;
                };
            case DIGIT_5:
                return switch (color) {
                    case RED -> DIGIT_5_RED;
                    case GREEN -> DIGIT_5_GREEN;
                    case BLUE -> DIGIT_5_BLUE;
                    case CYAN -> DIGIT_5_CYAN;
                    case YELLOW -> DIGIT_5_YELLOW;
                    case WHITE -> DIGIT_5_WHITE;
                };
            case DIGIT_6:
                return switch (color) {
                    case RED -> DIGIT_6_RED;
                    case GREEN -> DIGIT_6_GREEN;
                    case BLUE -> DIGIT_6_BLUE;
                    case CYAN -> DIGIT_6_CYAN;
                    case YELLOW -> DIGIT_6_YELLOW;
                    case WHITE -> DIGIT_6_WHITE;
                };
            case DIGIT_7:
                return switch (color) {
                    case RED -> DIGIT_7_RED;
                    case GREEN -> DIGIT_7_GREEN;
                    case BLUE -> DIGIT_7_BLUE;
                    case CYAN -> DIGIT_7_CYAN;
                    case YELLOW -> DIGIT_7_YELLOW;
                    case WHITE -> DIGIT_7_WHITE;
                };
            case DIGIT_8:
                return switch (color) {
                    case RED -> DIGIT_8_RED;
                    case GREEN -> DIGIT_8_GREEN;
                    case BLUE -> DIGIT_8_BLUE;
                    case CYAN -> DIGIT_8_CYAN;
                    case YELLOW -> DIGIT_8_YELLOW;
                    case WHITE -> DIGIT_8_WHITE;
                };
            case DIGIT_9:
                return switch (color) {
                    case RED -> DIGIT_9_RED;
                    case GREEN -> DIGIT_9_GREEN;
                    case BLUE -> DIGIT_9_BLUE;
                    case CYAN -> DIGIT_9_CYAN;
                    case YELLOW -> DIGIT_9_YELLOW;
                    case WHITE -> DIGIT_9_WHITE;
                };
            case COLON:
                return switch (color) {
                    case RED -> COLON_RED;
                    case GREEN -> COLON_GREEN;
                    case BLUE -> COLON_BLUE;
                    case CYAN -> COLON_CYAN;
                    case YELLOW -> COLON_YELLOW;
                    case WHITE -> COLON_WHITE;
                };
            case POINT:
                return switch (color) {
                    case RED -> POINT_RED;
                    case GREEN -> POINT_GREEN;
                    case BLUE -> POINT_BLUE;
                    case CYAN -> POINT_CYAN;
                    case YELLOW -> POINT_YELLOW;
                    case WHITE -> POINT_WHITE;
                };
            case COMMA:
                return switch (color) {
                    case RED -> COMMA_RED;
                    case GREEN -> COMMA_GREEN;
                    case BLUE -> COMMA_BLUE;
                    case CYAN -> COMMA_CYAN;
                    case YELLOW -> COMMA_YELLOW;
                    case WHITE -> COMMA_WHITE;
                };

        }
        return null;
    }


    /**
     * get icon from one character string out of:
     * "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ":", ".", ","
     * @param digit string containing one of above characters
     * @param color one of COLORS-enumeration
     * @return the digit-icon
     */
    public static ImageIcon getIcon(String digit, COLORS color) {

        return switch (digit) {
            case "0" -> getIcon(DIGITS.DIGIT_0, color);
            case "1" -> getIcon(DIGITS.DIGIT_1, color);
            case "2" -> getIcon(DIGITS.DIGIT_2, color);
            case "3" -> getIcon(DIGITS.DIGIT_3, color);
            case "4" -> getIcon(DIGITS.DIGIT_4, color);
            case "5" -> getIcon(DIGITS.DIGIT_5, color);
            case "6" -> getIcon(DIGITS.DIGIT_6, color);
            case "7" -> getIcon(DIGITS.DIGIT_7, color);
            case "8" -> getIcon(DIGITS.DIGIT_8, color);
            case "9" -> getIcon(DIGITS.DIGIT_9, color);
            case ":" -> getIcon(DIGITS.COLON, color);
            case "." -> getIcon(DIGITS.POINT, color);
            case "," -> getIcon(DIGITS.COMMA, color);
            default -> null;
        };
    }

}
