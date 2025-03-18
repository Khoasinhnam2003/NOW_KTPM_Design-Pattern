package decorator;

// Decorator: Kế toán trưởng
public class ChiefAccountantDecorator extends EmployeeDecorator {
    public ChiefAccountantDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void showTasks() {
        super.showTasks();
        System.out.println("Công việc: Quản lý tài chính, Lập báo cáo tài chính.");
    }
}