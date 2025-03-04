package decorator;

// Decorator chung để mở rộng trách nhiệm cho nhân viên
public class EmployeeDecorator implements Employee {
    protected Employee employee;

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void showTasks() {
        employee.showTasks();
    }
}
