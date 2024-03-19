package org.Collections.Sets;


// Read the above string and display the employee details without duplicates (id,name,dept)

import lombok.Data;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
@Data
class Employee{
    private String name;
    private String id;
    private String dept;
}

class EmployeeService{

    public void showEmployeeDetails(){
        String data = "1001-Krish-DEV,1002-Manoj-DEV,1001-Krish-DEV,1001-John-HR,1003-John-HR,1004-Smith-UI,1005-Krish-HR,1003-John-HR";
        String [] e = data.split(",");
        Set<Employee> set = new HashSet<>();
        for(String s:e){
            String[] split = s.split("-");
            Employee employee = new Employee();
            employee.setId(split[0]);
            employee.setName(split[1]);
            employee.setDept(split[2]);
            set.add(employee);
        }
        for (Employee emp: set) {
            System.out.println("Id: "+emp.getId());
            System.out.println("Name: "+emp.getName());
            System.out.println("Dep: "+emp.getDept());
            System.out.println("*********************");
        }
    }
}
public class SetAssignmentQuestion {
    public static void main(String[]args){
        EmployeeService s = new EmployeeService();

        s.showEmployeeDetails();
    }


}
