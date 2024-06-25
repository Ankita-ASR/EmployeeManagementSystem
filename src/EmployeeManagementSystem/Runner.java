package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.Arrays;
public class Runner {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        ArrayList<Employee> employees = new ArrayList<>
                (Arrays.asList(
                        new FullTimeEmployee("Anu", "303A", 5000),
                        new PartTimeEmployee("Sneha", "102A", 20, 80),
                        new ContractEmployee("Ankita", "101Z", 6, 30000),
                        new ContractEmployee("Any", "131Z", 1, 600000)));


        for (Employee i : employees) {
            employeeManager.addEmployee(i);
        }
        employeeManager.displayAllEmployees();


        for (Employee i : employees) {
            if (i.isContractEmployee() && i.calculateSalary()>50000) {
                employeeManager.removeEmployee(i);
            }
        }
        System.out.println("After removing : ");
        employeeManager.displayAllEmployees();


        System.out.println("Total Salary of All Employees: $" + employeeManager.calculateTotalSalary());
    }
}
