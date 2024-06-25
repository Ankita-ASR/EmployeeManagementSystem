package EmployeeManagementSystem;
import java.util.ArrayList;
 class EmployeeManager {
     ArrayList<Employee>  employees = new ArrayList<>();
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("--------------------");
        }
    }

    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.calculateSalary();
        }
        return totalSalary;
    }
}

