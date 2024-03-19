package org.Collections.EmployeeCurrencyJsonAssignment;

import lombok.Data;

@Data
public class EmployeeFormattedData {
    private int id;
    private String fullName;
    private String email;
    private double salary;
    //we dont have these two so we should formate the salary and currency name.
    private String formattedSalary;
    private String currencyName;

}
