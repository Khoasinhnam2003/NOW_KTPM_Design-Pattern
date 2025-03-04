package strategy;

// Chiến lược: Đội trưởng
public class CaptainStrategy implements WorkStrategy {
    @Override
    public void executeTasks() {
        System.out.println("Công việc: Đi tuần, Gán việc nhân viên");
    }
}