package Composite.Sirket;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee{
    List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }

    @Override
    public void EmployeDetails() {
        for(Employee emp: employeeList){
            emp.EmployeDetails();
        }
    }
}
