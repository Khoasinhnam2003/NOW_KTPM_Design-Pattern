package bt11_3Bai1;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Pham Anh Khoa");
        SinhVien sv2 = new SinhVien("Nguyen Gia Huy");

        LopHoc lopHoc = new LopHoc("DHKTPM17C");
        lopHoc.attach(sv1);
        lopHoc.attach(sv2);

        lopHoc.notifyObservers();

        lopHoc.detach(sv1);
        lopHoc.notifyObservers();

    }
}