package state;

// Trạng thái: Nhân viên VP
public class OfficeEmployeeState implements EmployeeState {
    @Override
    public void showTasks() {
        System.out.println("Công việc: Pha trà, Phê duyệt giấy tờ");
    }
}