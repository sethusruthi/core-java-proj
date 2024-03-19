package org.Collections.EmployeeCurrencyJsonAssignment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Currency {
    private String name;
    private String code;
    private String symbol;
    @JsonProperty("decimal_digits")
    private int decimalDigits;
}
