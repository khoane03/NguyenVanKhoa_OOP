package OOP_T7.BAI3;

class HangThucPham extends HangHoa {
    String ngaySanXuat;
    String ngayHetHan;

    public HangThucPham(String maHang, String tenHang, String nhaSanXuat, double gia, String ngaySanXuat, String ngayHetHan) {
        super(maHang, tenHang, nhaSanXuat, gia);        this.ngayHetHan = ngayHetHan;
        this.ngaySanXuat = ngaySanXuat;
    }
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Ngày sản xuất: " + ngaySanXuat);
        System.out.println("Ngày hết hạn: " + ngayHetHan);
    }
}

