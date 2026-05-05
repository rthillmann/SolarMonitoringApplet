package de.rthillmann.solarmonitoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitIconsTest {

    @Test
    void getIcon() {
        assertEquals(DigitIcons.DIGIT_0_RED,    DigitIcons.getIcon(DigitIcons.DIGITS.DIGIT_0, DigitIcons.COLORS.RED));
        assertEquals(DigitIcons.DIGIT_1_BLUE,   DigitIcons.getIcon(DigitIcons.DIGITS.DIGIT_1, DigitIcons.COLORS.BLUE));
        assertEquals(DigitIcons.DIGIT_2_YELLOW, DigitIcons.getIcon(DigitIcons.DIGITS.DIGIT_2, DigitIcons.COLORS.YELLOW));
        assertEquals(DigitIcons.DIGIT_3_CYAN,   DigitIcons.getIcon(DigitIcons.DIGITS.DIGIT_3, DigitIcons.COLORS.CYAN));
        assertEquals(DigitIcons.DIGIT_9_GREEN,  DigitIcons.getIcon(DigitIcons.DIGITS.DIGIT_9, DigitIcons.COLORS.GREEN));
    }

    @Test
    void testGetIcon() {
        assertEquals(DigitIcons.DIGIT_0_CYAN,   DigitIcons.getIcon("0", DigitIcons.COLORS.CYAN));
        assertEquals(DigitIcons.DIGIT_5_BLUE,   DigitIcons.getIcon("5", DigitIcons.COLORS.BLUE));
        assertEquals(DigitIcons.DIGIT_9_YELLOW, DigitIcons.getIcon("9", DigitIcons.COLORS.YELLOW));
        assertEquals(DigitIcons.DIGIT_6_WHITE,  DigitIcons.getIcon("6", DigitIcons.COLORS.WHITE));
        assertEquals(DigitIcons.DIGIT_4_GREEN,  DigitIcons.getIcon("4", DigitIcons.COLORS.GREEN));
    }
}