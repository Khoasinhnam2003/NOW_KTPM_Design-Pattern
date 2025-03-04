package decorator;

// Nhân viên cơ bản (chưa có chức vụ cụ thể)
public class BaseEmployee implements Employee {
    @Override
    public void showTasks() {
        System.out.println("Nhân viên cơ bản, chưa có công việc cụ thể.");
    }
}