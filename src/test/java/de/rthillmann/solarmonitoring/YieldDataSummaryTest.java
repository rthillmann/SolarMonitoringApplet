package de.rthillmann.solarmonitoring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YieldDataSummaryTest {

    YieldData total;
    YieldData day;
    YieldData power;
    YieldDataSummary summary;

    @BeforeEach
    void setUp() {
        total   = new YieldData("Power", "123.4", "W", "1");
        day     = new YieldData("Power", "123.4", "W", "1");
        power   = new YieldData("Power", "123.4", "W", "1");
        summary = new YieldDataSummary(total, day, power);
    }

    @Test
    void yieldTotal() {
        assertEquals(total, summary.yieldTotal());
    }

    @Test
    void yieldDay() {
        assertEquals(day, summary.yieldDay());
    }

    @Test
    void power() {
        assertEquals(power, summary.power());
    }
}