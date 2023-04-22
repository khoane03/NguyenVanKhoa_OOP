package OOP_T7.BAI3;
class HangHoa {
    String maHang;
    String tenHang;
    String nhaSanXuat;
    double gia;
  
    // Constructor
    public HangHoa(String maHang, String tenHang, String nhaSanXuat, double gia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nhaSanXuat = nhaSanXuat;
        this.gia = gia;
    }
  
    // Phương thức in thông tin hàng hóa
    public void inThongTin() {
        System.out.println("Mã hàng: " + maHang);
        System.out.println("Tên hàng: " + tenHang);
        System.out.println("Nhà sản xuất: " + nhaSanXuat);
        System.out.println("Giá: " + gia);
    }
}
  

  

  
