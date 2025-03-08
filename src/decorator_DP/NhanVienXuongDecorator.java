package decorator_DP;

public class NhanVienXuongDecorator extends EmployeeDecorator {
    private int productsManufactured;
    private int qualityScore;

    public NhanVienXuongDecorator(IEmployee employee) {
        super(employee);
        this.productsManufactured = 0;
        this.qualityScore = 90; // Default quality score out of 100
    }

    @Override
    public void performDuties() {
        super.performDuties();
        System.out.println("\nCông việc của Nhân Viên Xưởng:");
        operateMachinery();
        manufactureProducts();
        checkQuality();
        reportProduction();
    }

    private void operateMachinery() {
        System.out.println("Vận hành máy móc:");
        System.out.println("- Kiểm tra thiết bị trước ca làm");
        System.out.println("- Vận hành máy sản xuất");
        System.out.println("- Bảo dưỡng thiết bị định kỳ");
    }

    private void manufactureProducts() {
        productsManufactured += 100;
        System.out.println("\nSản xuất sản phẩm:");
        System.out.println("- Đã sản xuất " + productsManufactured + " sản phẩm");
        System.out.println("- Theo dõi quy trình sản xuất");
        System.out.println("- Tối ưu hóa năng suất");
    }

    private void checkQuality() {
        System.out.println("\nKiểm tra chất lượng:");
        System.out.println("- Điểm chất lượng: " + qualityScore + "/100");
        System.out.println("- Kiểm tra sản phẩm lỗi");
        System.out.println("- Đảm bảo tiêu chuẩn");
    }

    private void reportProduction() {
        System.out.println("\nBáo cáo sản lượng:");
        System.out.println("- Ghi chép số liệu sản xuất");
        System.out.println("- Báo cáo tình trạng máy móc");
        System.out.println("- Đề xuất cải tiến quy trình");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + 
               " + Nhân Viên Xưởng [Products: " + productsManufactured + 
               ", Quality: " + qualityScore + "%]";
    }
}