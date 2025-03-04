package strategy_DP;

public class GiamDocStrategy implements RoleStrategy {


	 @Override
	    public void performDuties() {
	        System.out.println("Giám Đốc");
	        System.out.println("1. Hoạch định chiến lược công ty");
	        System.out.println("2. Ra quyết định quan trọng");
	        System.out.println("3. Đại diện công ty đối ngoại");
	        System.out.println("4. Quản lý toàn bộ hoạt động");
	    }
}
