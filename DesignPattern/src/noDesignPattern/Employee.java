package noDesignPattern;

class Employee {
    private String position;

    public Employee(String position) {
        this.position = position;
    }

    public void showTasks() {
        switch (position) {
            case "Đội Trưởng":
                System.out.println("Công việc: Đi tuần, Gán việc nhân viên");
                break;
            case "Giám đốc":
                System.out.println("Công việc: Quản lý công ty, Ra quyết định lớn");
                break;
            case "Nhân viên VP":
                System.out.println("Công việc: Pha trà, Phê duyệt giấy tờ");
                break;
            case "Nhân Viên Xưởng":
                System.out.println("Công việc: Vận hành máy móc, Báo cáo sản xuất");
                break;
            case "Kế Toán Trưởng":
                System.out.println("Công việc: Quản lý tài chính, Lập báo cáo tài chính");
                break;
            default:
                System.out.println("Không có công việc cụ thể cho chức vụ này.");
                break;
        }
    }
}