package EmployeeManagementSystem;
class PartTimeEmployee extends Employee {
    private final double hourlyWage;
    private final int hoursWorked;

    public PartTimeEmployee(String name, String employeeID, double hourlyWage, int hoursWorked) {
        super(name, employeeID);
        this.hourlyWage = hourlyWage;//the amount of money per work hour
        this.hoursWorked = hoursWorked;
    }

    @Override
    public boolean isContractEmployee() {
        return false;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}
