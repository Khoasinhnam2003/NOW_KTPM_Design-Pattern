package noDesignPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập chức vụ nhân viên: ");
            String position = scanner.nextLine().trim();

            if (position.equalsIgnoreCase("exit")) {
                System.out.println("Chương trình kết thúc.");
                break;
            }

            Employee employee = new Employee(position);
            employee.showTasks();
        }

        scanner.close();
    }
}
