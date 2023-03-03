package OOP_T3;

import java.util.Scanner;

public class Bai12 {
    public static int FindMax(int arr[][]) {
        int Max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (Max < arr[i][j]) {
                    Max = arr[i][j];
                }
            }
        }
        return Max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang : ");
        int n = sc.nextInt();
        System.out.print("Nhap so cot : ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("array[" + i + "]" + "[" + j + "]" + " : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Gia tri lon nhat trong ma tran : " + FindMax(arr));
    }
}
