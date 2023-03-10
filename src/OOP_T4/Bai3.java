package OOP_T4;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner Enter = new Scanner(System.in);
        System.out.print("Nhap ten cua ban : ");
        String name = Enter.nextLine();
        System.out.print("Nhap tuoi cua ban : ");
        int tuoi = Enter.nextInt();
        if (tuoi < 16) {
            System.out.println("Ban " + name + " o do tuoi vi thanh nien ");
        }else if(tuoi >= 16 && tuoi < 18) {
            System.out.println("Ban " + name + " o do tuoi truong thanh ");

        }else {
            System.out.println("Ban " + name + " da gia :(( ");

        }
    
    }
}
