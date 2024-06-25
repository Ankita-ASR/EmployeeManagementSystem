package EmployeeManagementSystem;
class ContractEmployee extends Employee {
    private final int projectDuration;
    private final double projectFee; //full salary of project

    public ContractEmployee(String name, String employeeID, int projectDuration, double projectFee) {
        super(name, employeeID);
        this.projectDuration = projectDuration;
        this.projectFee = projectFee;
    }

    @Override
    public boolean isContractEmployee() {
        return true;
    }

    @Override
    public double calculateSalary() {

        return projectFee / projectDuration;//salary per month
    }
}
