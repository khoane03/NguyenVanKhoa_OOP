import java.util.Scanner;

public class Bai2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("So lon nhat trong hai so ");
    System.out.print("Nhap so thu nhat : ");
    int a = sc.nextInt();
    System.out.print("Nhap so thu hai : ");
    int b = sc.nextInt();
    int Max = (a>b)?a:b;
    System.out.print("So lon nhat la : " + Max);

  }  
}
