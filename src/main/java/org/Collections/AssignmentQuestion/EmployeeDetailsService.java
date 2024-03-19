package org.Collections.AssignmentQuestion;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDetailsService {



    List<EmployeeDetails> list = new ArrayList<>();

    public EmployeeDetailsService(String data) {
        // Logic to parse the data and add the employee details to the list
        String[]arr = data.split(",");
        for(String e:arr){
            String[] empArr = e.split("-");
            String role = empArr[2];
            String name = empArr[1];
            int empno = Integer.parseInt(empArr[0]);
            double salary = Double.parseDouble(empArr[3]);
            list.add(new EmployeeDetails(name, empno,role,salary));
        }
    }

    public double totalSalary() {
    double totalSalary = 0;
    for(EmployeeDetails obj:list){
        totalSalary+=obj.getSalary();
    }
        return totalSalary;
    }

    public double maxSalary() {
        double maxSalary = 0;
        for(EmployeeDetails Ep:list){
            if(maxSalary<Ep.getSalary()){
                maxSalary =Ep.getSalary();
            }
        }
        return maxSalary;
    }

    public List<String> employeeNames() {
        List<String>empNames = new ArrayList<>();
        for(EmployeeDetails e:list){
            empNames.add(e.getName());
        }

        return empNames;
    }

    public List<Integer> employeeIds() {
        List<Integer>emp = new ArrayList<>();
        for(EmployeeDetails e:list){
            emp.add(e.getEmpno());
        }
        return emp;
    }

    public List<EmployeeBasicDetails> employeeDetails() {
        List<EmployeeBasicDetails>emp = new ArrayList<>();
        for(EmployeeDetails e:list){
            emp.add(new EmployeeBasicDetails(e.getEmpno(),e.getName()));
        }
        return emp;
    }


}
