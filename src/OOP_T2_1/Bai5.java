package OOP_T2_1;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Sum = 0;
        while (Sum <= 100) {
            System.out.print("ENTER (Sum > 100) : ");
            int number = sc.nextInt();
            Sum += number;
        }
        System.out.print("Print Sum : " + Sum);
    }
}
