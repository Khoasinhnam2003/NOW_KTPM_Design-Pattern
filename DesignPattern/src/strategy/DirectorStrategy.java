package strategy;

// Chiến lược: Giám đốc
public class DirectorStrategy implements WorkStrategy {
    @Override
    public void executeTasks() {
        System.out.println("Công việc: Quản lý công ty, Ra quyết định lớn");
    }
}