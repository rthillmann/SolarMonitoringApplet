/**
 * Record to hold data YieldData for one solar power plant, containing YieldTotal-, YieldDay- and Power-record.
 *
 * @param yieldTotal	yield total data of type YieldData
 * @param yieldDay      yield day data of type YieldData
 * @param power         power data of type YieldData
 */
package de.rthillmann.solarmonitoring;

import java.util.Objects;

public record YieldDataSummary(YieldData yieldTotal, YieldData yieldDay, YieldData power) {

    public YieldDataSummary {
        Objects.requireNonNull(yieldTotal);
        Objects.requireNonNull(yieldDay);
        Objects.requireNonNull(power);
    }
}

