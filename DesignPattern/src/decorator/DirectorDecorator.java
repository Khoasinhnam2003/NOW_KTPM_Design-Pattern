package decoratorPattern;

// Decorator: Giám đốc
public class DirectorDecorator extends EmployeeDecorator {
    public DirectorDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void showTasks() {
        super.showTasks();
        System.out.println("Công việc: Quản lý công ty, Ra quyết định lớn.");
    }
}
