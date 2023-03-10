package OOP_T5;

import java.util.Scanner;

public class Bai8 {
    static float AVG(int arr[]) {
        float avg = 0;
        int Sum = 0;
        for (int x : arr) {

            avg = (float) (Sum += x) / arr.length;

        }
        return avg;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu trong mang : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("array[" + i + "]" + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Trung binh cong cac so vua nhap : " + AVG(arr));
    }
}
