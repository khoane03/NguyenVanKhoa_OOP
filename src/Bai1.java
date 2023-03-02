import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner Enter = new Scanner(System.in);
        System.out.print("Nhap so thu nhat : ");
        int a = Enter.nextInt();
        System.out.print("Nhap so thu hai : ");
        int b = Enter.nextInt();
        System.out.println("Tong : " + (a + b));
        System.out.println("Hieu : " + (a - b));
        System.out.println("Tich : " + (a * b));
        System.out.println("Thuong : " + (a /(1.0*b)));
        System.out.println("Chia lay phan du : " + (a % b));
        int temp = (a>b)?a:b;
        System.out.println("So "  + temp + " la so lon hon ");



    }
}
