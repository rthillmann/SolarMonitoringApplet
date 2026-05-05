package de.rthillmann.solarmonitoring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YieldDataTest {

    YieldData yieldData;

    @BeforeEach
    void setUp() {
        yieldData = new YieldData("Power", "123.4", "W", "1");
    }

    @Test
    void label() {
        assertEquals("Power", yieldData.label());
    }

    @Test
    void value() {
        assertEquals("123.4", yieldData.value());
    }

    @Test
    void unit() {
        assertEquals("W", yieldData.unit());
    }

    @Test
    void decimals() {
        assertEquals("1", yieldData.decimals());
    }
}