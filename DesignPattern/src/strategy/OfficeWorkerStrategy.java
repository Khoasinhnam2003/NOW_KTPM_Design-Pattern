package strategy;

// Chiến lược: Nhân viên VP
public class OfficeWorkerStrategy implements WorkStrategy {
    @Override
    public void executeTasks() {
        System.out.println("Công việc: Pha trà, Phê duyệt giấy tờ");
    }
}