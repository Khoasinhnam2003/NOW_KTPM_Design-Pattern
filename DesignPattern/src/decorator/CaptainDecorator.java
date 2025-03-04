package decorator;

// Decorator: Đội trưởng
public class CaptainDecorator extends EmployeeDecorator {
    public CaptainDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void showTasks() {
        super.showTasks();
        System.out.println("Công việc: Đi tuần, Gán việc nhân viên.");
    }
}
