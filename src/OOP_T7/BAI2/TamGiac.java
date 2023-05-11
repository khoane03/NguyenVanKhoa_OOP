package OOP_T7.BAI2;

public class TamGiac extends Diem {
    Diem A = new Diem();
    Diem B = new Diem();
    Diem C = new Diem();

    public void NhapTG() {

        System.out.println("Nhap toa do A : ");
        A.Nhap();
        System.out.println("Nhap toa do B : ");
        B.Nhap();
        System.out.println("Nhap toa do C : ");
        C.Nhap();

    }

    public void InTamGiac() {
        System.out.println(
                "Toa do 3 diem A,B,C vua nhap : A(" + A.x + "," + A.y + ")" + " " + "B(" + B.x + "," + B.y + ")"
                        + " " + "C(" + C.x + "," + C.y + ")");
    }

    public boolean KiemTra() {
        double AB, AC, BC;
        AB = Math.sqrt(Math.pow(A.x - B.x, 2) + Math.pow(A.y - B.y, 2));
        AC = Math.sqrt(Math.pow(A.x - C.x, 2) + Math.pow(A.y - C.y, 2));
        BC = Math.sqrt(Math.pow(C.x - B.x, 2) + Math.pow(A.y - B.y, 2));

        if (AB + AC > BC || AB + BC > AC || BC + AC > AB) {
            return true;
        } else {
            return false;
        }

    }

    public double ChuVi() {
        double AB, AC, BC;
        AB = Math.sqrt(Math.pow(A.x - B.x, 2) + Math.pow(A.y - B.y, 2));
        AC = Math.sqrt(Math.pow(A.x - C.x, 2) + Math.pow(A.y - C.y, 2));
        BC = Math.sqrt(Math.pow(C.x - B.x, 2) + Math.pow(A.y - B.y, 2));
        return (float) AC + AC + BC;
    }

    public double DienTich() {
        double p = ChuVi() / 2;
        double AB, AC, BC;
        AB = Math.sqrt(Math.pow(A.x - B.x, 2) + Math.pow(A.y - B.y, 2));
        AC = Math.sqrt(Math.pow(A.x - C.x, 2) + Math.pow(A.y - C.y, 2));
        BC = Math.sqrt(Math.pow(C.x - B.x, 2) + Math.pow(A.y - B.y, 2));
        return (float) Math.sqrt(p * (p - AB) * (p - AC) * (p - BC));
    }

}
