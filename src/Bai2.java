import java.util.Scanner;

public class Bai2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap so : ");
    int a = sc.nextInt();
    if (a % 2 == 0)
      System.out.print("So " + a + " la so chan  ");
    else
      System.out.print("So " + a + " la so le  ");

  }
}
