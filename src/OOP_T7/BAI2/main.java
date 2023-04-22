package OOP_T7.BAI2;

import OOP_T7.BAI2.*;;

public class main {

    public static void main(String[] args) {
        System.out.println("===========================================================================");
        Diem d = new Diem();
        d.Nhap();
        d.In();
        System.out.println("===========================================================================");
        TamGiac t = new TamGiac();
        t.NhapTG();
        t.InTamGiac();
        System.out.println("Toa do ba diem ABC la tam giac : " + t.KiemTra());
        System.out.println("Chu vi tam giac : " + t.ChuVi());
        System.out.println("Dien tich cua tam giac : " + t.DienTich());
        System.out.println("===========================================================================");
        DuongTron r = new DuongTron();
        r.NhapDT();
        r.InHT();
        System.out.println("Chu vi hinh tron : " + r.ChuviHT());
        System.out.println("===========================================================================");

    }
}