package OOP_T5;

import java.util.Scanner;

public class Bai11 {

    public static void SortUp(int arr[]) {
        int Temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    Temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = Temp;
                }
            }
        }
        Print(arr);
    }

    public static void Print(int arr[]) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
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
        System.out.print("Mang vua nhap : ");
        Print(arr);
        System.out.println();
        System.out.print("Mang da sap xep tang : ");
        SortUp(arr);

    }

}