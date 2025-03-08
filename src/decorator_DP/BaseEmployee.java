package decorator_DP;

public class BaseEmployee implements IEmployee {
    private String name;

    public BaseEmployee(String name) {
        this.name = name;
    }

    @Override
    public void performDuties() {
        System.out.println("\nNhân viên: " + name);
        System.out.println("Công việc cơ bản:");
        System.out.println("1. Đúng giờ làm việc");
        System.out.println("2. Tuân thủ nội quy");
        System.out.println("3. Hoàn thành công việc được giao");
        System.out.println("4. Báo cáo tiến độ định kỳ");
    }

    @Override
    public String getDescription() {
        return "Nhân viên cơ bản: " + name;
    }

    public String getName() {
        return name;
    }
}