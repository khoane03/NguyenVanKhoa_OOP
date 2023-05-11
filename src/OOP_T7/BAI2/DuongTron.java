package OOP_T7.BAI2;

import java.util.Scanner;

public class DuongTron extends Diem {
    private int r;
    Diem O = new Diem();
    private final double pi = 3.14;

    public void NhapDT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap toa do tam O : ");
        O.Nhap();
        System.out.print("Nhap ban kinh : ");
        r = sc.nextInt();
    }

    public void InHT() {
        System.out.println("Toa do tam O(" + O.x + "," + O.y + ")" + " -- Ban kinh r = " + r);
    }

    public double ChuviHT() {
        return (float) 2 * pi * r;
    }

    public double DienTichHt() {
        return (float) pi * Math.pow(r, 2);
    }

}
