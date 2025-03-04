package state_DP;

public class KeToanTruongState implements EmployeeState {

	 @Override
	    public void performDuties() {
	        System.out.println("Kế Toán Trưởng");
	        System.out.println("1. Quản lý tài chính");
	        System.out.println("2. Lập báo cáo kế toán");
	        System.out.println("3. Kiểm soát chi tiêu");
	        System.out.println("4. Thanh toán lương");
	    }
	

}
