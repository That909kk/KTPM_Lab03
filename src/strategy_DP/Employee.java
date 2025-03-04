package strategy_DP;
public class Employee {
    private String name;
    private RoleStrategy roleStrategy;

    public Employee(String name, RoleStrategy roleStrategy) {
        this.name = name;
        this.roleStrategy = roleStrategy;
    }

    public Employee(String name2, NhanVienVPStrategy roleStrategy2) {
		
	}

	
	public void performDuties() {
        System.out.println("\nEmployee: " + name);
        roleStrategy.performDuties();
    }

    public void setRoleStrategy(RoleStrategy newStrategy) {
        this.roleStrategy = newStrategy;
    }

    public static void main(String[] args) {
       

        Employee doiTruong = new Employee("Nguyen Van A", new DoiTruongStrategy());
        doiTruong.performDuties();

    }
}