package state;

public class Employee {
    private String name;
    private EmployeeState state; // Trạng thái hiện tại của nhân viên

    public Employee(String name) {
        this.name = name;
    }

    // Thiết lập trạng thái nhân viên (chức vụ)
    public void setState(EmployeeState state) {
        this.state = state;
    }

    // Hiển thị thông tin nhân viên và công việc tương ứng
    public void displayInfo() {
        System.out.println("Nhân viên: " + name);
        if (state != null) {
            state.showTasks();
        } else {
            System.out.println("Chưa có chức vụ cụ thể.");
        }
    }
}