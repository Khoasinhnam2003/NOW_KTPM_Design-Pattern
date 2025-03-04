package strategy;

// Chiến lược: Nhân viên Xưởng
public class FactoryWorkerStrategy implements WorkStrategy {
    @Override
    public void executeTasks() {
        System.out.println("Công việc: Vận hành máy móc, Báo cáo sản xuất");
    }
}