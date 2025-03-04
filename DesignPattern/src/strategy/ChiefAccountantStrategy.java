package strategy;

// Chiến lược: Kế toán trưởng
public class ChiefAccountantStrategy implements WorkStrategy {
    @Override
    public void executeTasks() {
        System.out.println("Công việc: Quản lý tài chính, Lập báo cáo tài chính");
    }
}