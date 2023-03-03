package OOP_T2_1;

import java.util.Scanner;

public class Bai6 {
    static int factorial(int n) {
        if (n == 1)
            return 1;
        return factorial(n - 1) * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = sc.nextInt();
        System.out.println(n + "!" + " = "+ factorial(n));

    }
}
