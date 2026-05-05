/**
 * Record to hold data retrieved from OpenDTU as label, value, unit and decimals.
 *
 * @param label	    label for yield data as eg. "Power", "YieldTotal" or "YieldDay"
 * @param value     value of yield data
 * @param unit      unit of yield date eq. "W", or "kWh"
 * @param decimals	decimals in value of yield data, eg. "1", "3".
 */
package de.rthillmann.solarmonitoring;

import java.util.Objects;

public record YieldData(String label, String value, String unit, String decimals) {

    public YieldData {
        Objects.requireNonNull(label);
        Objects.requireNonNull(value);
        Objects.requireNonNull(unit);
        Objects.requireNonNull(decimals);
    }
}

