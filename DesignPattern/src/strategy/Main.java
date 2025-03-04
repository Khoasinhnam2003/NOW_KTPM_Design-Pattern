package strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tên nhân viên
        System.out.print("Nhập tên nhân viên: ");
        String name = scanner.nextLine();

        Employee employee = new Employee(name);

        while (true) {
            // Nhập chức vụ từ người dùng
            System.out.print("Nhập chức vụ nhân viên: ");
            String position = scanner.nextLine().trim();

            if (position.equalsIgnoreCase("exit")) {
                System.out.println("Chương trình kết thúc.");
                break;
            }

            // Thiết lập chiến lược tương ứng với chức vụ nhập vào
            switch (position) {
                case "Đội Trưởng":
                    employee.setWorkStrategy(new CaptainStrategy());
                    break;
                case "Giám đốc":
                    employee.setWorkStrategy(new DirectorStrategy());
                    break;
                case "Nhân viên VP":
                    employee.setWorkStrategy(new OfficeWorkerStrategy());
                    break;
                case "Nhân Viên Xưởng":
                    employee.setWorkStrategy(new FactoryWorkerStrategy());
                    break;
                case "Kế Toán Trưởng":
                    employee.setWorkStrategy(new ChiefAccountantStrategy());
                    break;
                default:
                    System.out.println("Chức vụ không hợp lệ.");
                    continue; // Quay lại vòng lặp nhập chức vụ
            }

            // Hiển thị thông tin nhân viên và công việc
            employee.displayInfo();
        }

        scanner.close();
    }
}