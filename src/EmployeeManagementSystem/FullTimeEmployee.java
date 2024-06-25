package EmployeeManagementSystem;
class FullTimeEmployee extends Employee {
    private  final double monthlySalary;

    public FullTimeEmployee(String name, String employeeID, double monthlySalary) {
        super(name, employeeID);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public boolean isContractEmployee() {
        return false;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary * 12;
    }
}

