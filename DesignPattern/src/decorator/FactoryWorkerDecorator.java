package decorator;

// Decorator: Nhân viên Xưởng
public class FactoryWorkerDecorator extends EmployeeDecorator {
    public FactoryWorkerDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void showTasks() {
        super.showTasks();
        System.out.println("Công việc: Vận hành máy móc, Báo cáo sản xuất.");
    }
}