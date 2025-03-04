package strategy;

public class Employee {
    private String name;
    private WorkStrategy workStrategy; // Chiến lược làm việc của nhân viên

    public Employee(String name) {
        this.name = name;
    }

    // Thiết lập chiến lược làm việc
    public void setWorkStrategy(WorkStrategy workStrategy) {
        this.workStrategy = workStrategy;
    }

    // Hiển thị thông tin nhân viên và công việc
    public void displayInfo() {
        System.out.println("Nhân viên: " + name);
        if (workStrategy != null) {
            workStrategy.executeTasks();
        } else {
            System.out.println("Chưa có chức vụ cụ thể.");
        }
    }
}