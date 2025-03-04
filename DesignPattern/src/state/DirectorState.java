package state;

// Trạng thái: Giám đốc
public class DirectorState implements EmployeeState {
    @Override
    public void showTasks() {
        System.out.println("Công việc: Quản lý công ty, Ra quyết định lớn");
    }
}