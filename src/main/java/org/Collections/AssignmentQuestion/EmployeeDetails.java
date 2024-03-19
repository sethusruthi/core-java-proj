package org.Collections.AssignmentQuestion;

public class EmployeeDetails {

    private String name;
    private int empno ;
    private String role ;
    private double salary;

    public EmployeeDetails(String name, int empno, String role, double salary) {
        this.name = name;
        this.empno = empno;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
