package Buoi4;

public class TruongCoTich extends Book{
    private int soTrang;

    public TruongCoTich(int maSach, String tenSach, TacGia tg, int namSanXuat, String tomTatNoiDung, double giaTien, int soTrang) {
        super(maSach, tenSach, tg, namSanXuat, tomTatNoiDung, giaTien);
        this.soTrang = soTrang;
    }

    @Override
    public void display() {
        super.display();
    }
}
