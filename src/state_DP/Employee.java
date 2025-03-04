package state_DP;
public class Employee {
    private String name;
    private EmployeeState state;

    public Employee(String name) {
        this.name = name;
    }

    public void setState(EmployeeState state) {
        this.state = state;
    }

    public void performDuties() {
        System.out.println("\nEmployee: " + name);
        if (state != null) {
            state.performDuties();
        } else {
            System.out.println("No role assigned");
        }
    }

    public static void main(String[] args) {

        Employee employee = new Employee("Nguyen Van A");

       
        employee.setState(new DoiTruongState());
        employee.performDuties();


        employee.setState(new NhanVienVPState());
        employee.performDuties();


        employee.setState(new GiamDocState());
        employee.performDuties();

 
        Employee employee2 = new Employee("Tran Thi B");


        employee2.setState(new KeToanTruongState());
        employee2.performDuties();
    }
}