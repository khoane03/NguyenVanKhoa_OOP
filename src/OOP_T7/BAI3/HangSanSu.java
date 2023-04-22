package OOP_T7.BAI3;

class HangSanhSu extends HangHoa {
    String loaiNguyenLieu;
  
    public HangSanhSu(String maHang, String tenHang, String nhaSanXuat, double gia, String loaiNguyenLieu) {
        super(maHang, tenHang, nhaSanXuat, gia);
        this.loaiNguyenLieu = loaiNguyenLieu;
    }
  
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Loại nguyên liệu: " + loaiNguyenLieu);
    }
}
