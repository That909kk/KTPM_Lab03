package decorator_DP;

public abstract class EmployeeDecorator implements IEmployee {
    protected IEmployee employee;

    public EmployeeDecorator(IEmployee employee) {
        this.employee = employee;
    }

    @Override
    public void performDuties() {
        employee.performDuties();
    }

    @Override
    public String getDescription() {
        return employee.getDescription();
    }
}