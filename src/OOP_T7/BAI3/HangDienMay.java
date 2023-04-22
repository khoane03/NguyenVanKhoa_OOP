package OOP_T7.BAI3;

class HangDienMay extends HangHoa {
    int thoiGianBaoHanh;
    int dienAp;
    int congSuat; 
    public HangDienMay(String maHang, String tenHang, String nhaSanXuat, double gia, int thoiGianBaoHanh, int dienAp, int congSuat) {
        super(maHang, tenHang, nhaSanXuat, gia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Thời gian bảo hành: " + thoiGianBaoHanh);
        System.out.println("Điện áp: " + dienAp);
        System.out.println("Công suất: " + congSuat);
    }
}