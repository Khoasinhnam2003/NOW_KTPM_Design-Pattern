package decorator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tên nhân viên
        System.out.print("Nhập tên nhân viên: ");
        String name = scanner.nextLine();

        // Nhân viên cơ bản
        Employee employee = new BaseEmployee();

        while (true) {
            // Nhập chức vụ từ người dùng
            System.out.print("Nhập chức vụ nhân viên (hoặc 'exit' để thoát): ");
            String position = scanner.nextLine().trim();

            if (position.equalsIgnoreCase("exit")) {
                System.out.println("Chương trình kết thúc.");
                break;
            }

            // Áp dụng Decorator tương ứng với chức vụ nhập vào
            switch (position) {
                case "Đội Trưởng":
                    employee = new CaptainDecorator(employee);
                    break;
                case "Giám đốc":
                    employee = new DirectorDecorator(employee);
                    break;
                case "Nhân viên VP":
                    employee = new OfficeWorkerDecorator(employee);
                    break;
                case "Nhân Viên Xưởng":
                    employee = new FactoryWorkerDecorator(employee);
                    break;
                case "Kế Toán Trưởng":
                    employee = new ChiefAccountantDecorator(employee);
                    break;
                default:
                    System.out.println("Chức vụ không hợp lệ.");
                    continue; // Quay lại vòng lặp nhập chức vụ
            }

            // Hiển thị thông tin nhân viên và công việc
            System.out.println("Nhân viên: " + name);
            employee.showTasks();
        }

        scanner.close();
    }
}
