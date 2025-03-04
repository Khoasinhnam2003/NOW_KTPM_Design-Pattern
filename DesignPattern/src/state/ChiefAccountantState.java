package state;

// Trạng thái: Kế toán trưởng
public class ChiefAccountantState implements EmployeeState {
    @Override
    public void showTasks() {
        System.out.println("Công việc: Quản lý tài chính, Lập báo cáo tài chính");
    }
}