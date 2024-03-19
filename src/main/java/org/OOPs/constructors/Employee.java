package org.OOPs.constructors;

public class Employee {
    private int empNo;
    private String empName;
    private double salary;
    private String PhoneNum;
    private String deptName;

    public Employee(int empNo,String empName, double salary){
        this(empNo,empName,salary,"n/a");
    }

    public Employee(int empNo, String empName, double salary,String PhoneNum) {
        this(empNo,empName,salary,PhoneNum,"n/a");

    }
    public Employee(int empNo,String empName,double salary,String PhoneNum,String deptName){
        this.empNo=empNo;
        this.empName=empName;
        this.salary=salary;
        this.PhoneNum=PhoneNum;
        this.deptName=deptName;
    }
    public void showDetails(){
        System.out.println("Empno :"+empNo);
        System.out.println("Ename :"+empName);
        System.out.println("Salary :"+salary);
        System.out.println("Dept :"+deptName);
        System.out.println("Mobile :"+PhoneNum);
    }
}
