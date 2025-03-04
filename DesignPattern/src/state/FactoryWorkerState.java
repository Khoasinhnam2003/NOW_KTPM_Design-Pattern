package state;

// Trạng thái: Nhân viên Xưởng
public class FactoryWorkerState implements EmployeeState {
    @Override
    public void showTasks() {
        System.out.println("Công việc: Vận hành máy móc, Báo cáo sản xuất");
    }
}