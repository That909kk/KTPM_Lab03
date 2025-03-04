package strategy_DP;

public class NhanVienXuongStrategy implements RoleStrategy {

	@Override
    public void performDuties() {
        System.out.println("Nhân Viên Xưởng");
        System.out.println("1. Vận hành máy móc");
        System.out.println("2. Sản xuất sản phẩm");
        System.out.println("3. Kiểm tra chất lượng");
        System.out.println("4. Báo cáo sản lượng");
    }
}
