package OOP_T7.BAI1;
import java.util.Scanner;

class SACH {
    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private int soTrang;
    private String loaiSach;
    private String nhaXuatBan;
    private int soTap;
    private double gia;
    public void NHAPSACH() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sách:");
        maSach = sc.nextLine();
        System.out.println("Nhập tên sách:");
        tenSach = sc.nextLine();
        System.out.println("Nhập tên tác giả:");
        tenTacGia = sc.nextLine();
        System.out.println("Nhập số trang:");
        soTrang = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập loại sách:");
        loaiSach = sc.nextLine();
        System.out.println("Nhập nhà xuất bản:");
        nhaXuatBan = sc.nextLine();
        System.out.println("Nhập số tập:");
        soTap = sc.nextInt();
        System.out.println("Nhập giá:");
        gia = sc.nextDouble();
    }


    public void INSACH() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tên tác giả: " + tenTacGia);
        System.out.println("Số trang: " + soTrang);
        System.out.println("Loại sách: " + loaiSach);
        System.out.println("Nhà xuất bản: " + nhaXuatBan);
        System.out.println("Số tập: " + soTap);
        System.out.println("Giá: " + gia);
    }
}

public class BAI_3_1 {
    public static void main(String[] args) {
        SACH sach = new SACH();
        sach.NHAPSACH();
        System.out.println("Thông tin cuốn sách vừa nhập:");
        sach.INSACH();
    }
}
