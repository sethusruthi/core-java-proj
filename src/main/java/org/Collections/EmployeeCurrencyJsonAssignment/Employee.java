package org.Collections.EmployeeCurrencyJsonAssignment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Employee {
    //we are using this because in file key is given as first_name format and we are taking firstName so to ignore it.
    @JsonProperty("first_name")
    private String firstName;
    private double salary;
    private int id;
    @JsonProperty("last_name")
    private String lastName;
    private String currency;
    private String email;
    private String gender;
}
