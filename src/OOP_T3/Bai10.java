package OOP_T3;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi : ");
        String strings = sc.nextLine();
        System.out.print("Nhap ki tu can dem : ");
        char kytu = sc.next().charAt(0);
        int Dem = 0;
        for (int i = 0; i < strings.length(); i++) {
            if (strings.charAt(i) == kytu)
                Dem++;

        }
        System.out.println("Ky tu " + kytu + " xuat hien " + Dem + " lan");

    }
}
