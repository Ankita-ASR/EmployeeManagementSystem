package EmployeeManagementSystem;
abstract class Employee {
    private String name;
    private String employeeID;

    public Employee(String name, String employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeID() {
        return employeeID;
    }
    public abstract double calculateSalary();
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: $" + calculateSalary());
    }

    public abstract boolean  isContractEmployee();


}

