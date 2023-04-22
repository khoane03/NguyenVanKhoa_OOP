package OOP_T7.BAI2;
import java.util.Scanner;

public class Diem {
    public int x, y;

    public Diem() {
        this.x = 0;
        this.y = 0;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap toa do x : ");
        x = sc.nextInt();
        System.out.print("Nhap toa do y : ");
        y = sc.nextInt();
    }

    public void In() {
        System.out.println("Gia tri diem vua nhap la : (" + this.x + "," + this.y + ")");
    }
}
