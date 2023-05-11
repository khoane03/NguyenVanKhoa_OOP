package OOP_T7.BAI3;
import OOP_T7.*;
import java.util.ArrayList;

// Lớp chứa main để thực hiện nhập và in danh sách hàng hóa
public class test{
public static void main(String[] args) {
// Tạo danh sách hàng hóa
ArrayList<HangHoa> danhSachHangHoa = new ArrayList<>();

// Thêm các loại hàng vào danh sách
danhSachHangHoa.add(new HangDienMay("DM001", "Tivi Sony 4K", "Sony", 20000000, 12, 220, 100));
danhSachHangHoa.add(new HangSanhSu("SS001", "Bộ ấm chén sành sứ", "Hoa Sơn", 500000, "Sành sứ"));
danhSachHangHoa.add(new HangThucPham("TP001", "Thịt ba chỉ", "Coopmart", 50000, "10/04/2023", "17/04/2023"));
danhSachHangHoa.add(new HangDienMay("DM002", "Máy lạnh Panasonic", "Panasonic", 12000000, 24, 220, 2000));
danhSachHangHoa.add(new HangSanhSu("SS002", "Ly sứ Minh Long", "Minh Long", 200000, "Sứ trắng"));
danhSachHangHoa.add(new HangThucPham("TP002", "Sữa tươi Vinamilk", "Vinamilk", 15000, "10/04/2023", "17/04/2023"));

// In danh sách hàng hóa theo từng loại
System.out.println("Danh sách hàng điện máy:");
for (HangHoa hangHoa : danhSachHangHoa) {
    if (hangHoa instanceof HangDienMay) {
        hangHoa.inThongTin();
        System.out.println("--------------------");
    }
}

System.out.println("Danh sách hàng sành sứ:");
for (HangHoa hangHoa : danhSachHangHoa) {
    if (hangHoa instanceof HangSanhSu) {
        hangHoa.inThongTin();
        System.out.println("--------------------");
    }
}

System.out.println("Danh sách hàng thực phẩm:");
for (HangHoa hangHoa : danhSachHangHoa) {
    if (hangHoa instanceof HangThucPham) {
        hangHoa.inThongTin();
        System.out.println("--------------------");
    }
}
}
}

