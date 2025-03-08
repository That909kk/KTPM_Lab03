package decorator_DP;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN =====\n");
        System.out.println("Nhập tên nhân viên:");
        String name = scanner.nextLine();
        
        System.out.println("\nChọn chức vụ cho nhân viên:");
        System.out.println("1. Đội Trưởng");
        System.out.println("2. Giám Đốc");
        System.out.println("3. Nhân Viên Văn Phòng");
        System.out.println("4. Nhân Viên Xưởng");
        System.out.println("5. Kế Toán Trưởng");
        
        int choice = scanner.nextInt();
        
        // Create base employee
        IEmployee employee = new BaseEmployee(name);
        
        // Decorate with chosen role
        switch (choice) {
            case 1:
                employee = new DoiTruongDecorator(employee);
                break;
            case 2:
                employee = new GiamDocDecorator(employee);
                break;
            case 3:
                employee = new NhanVienVPDecorator(employee);
                break;
            case 4:
                employee = new NhanVienXuongDecorator(employee);
                break;
            case 5:
                employee = new KeToanTruongDecorator(employee);
                break;
            default:
                System.out.println("Chức vụ không hợp lệ!");
                scanner.close();
                return;
        }
        
        // Display employee duties based on their role
        System.out.println("\n========= THÔNG TIN NHÂN VIÊN =========");
        System.out.println(employee.getDescription());
        System.out.println("\n========= CÔNG VIỆC PHẢI LÀM =========");
        employee.performDuties();
        
        scanner.close();
    }
}