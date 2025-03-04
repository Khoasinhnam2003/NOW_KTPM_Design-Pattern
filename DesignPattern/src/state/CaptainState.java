package state;

// Trạng thái: Đội trưởng
public class CaptainState implements EmployeeState {
    @Override
    public void showTasks() {
        System.out.println("Công việc: Đi tuần, Gán việc nhân viên");
    }
}