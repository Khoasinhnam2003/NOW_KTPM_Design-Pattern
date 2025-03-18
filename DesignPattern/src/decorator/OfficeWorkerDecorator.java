package decorator;

// Decorator: Nhân viên VP
public class OfficeWorkerDecorator extends EmployeeDecorator {
    public OfficeWorkerDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void showTasks() {
        super.showTasks();
        System.out.println("Công việc: Pha trà, Phê duyệt giấy tờ.");
    }
}