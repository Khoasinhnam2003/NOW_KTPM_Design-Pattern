package bt11_3Bai1;

public class SinhVien implements Observer {
    private String name;

    public SinhVien(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + " nhan thong bao: " + message);
    }
}