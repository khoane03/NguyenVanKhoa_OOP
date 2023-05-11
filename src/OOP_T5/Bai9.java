package OOP_T5;

import java.util.Scanner;

public class Bai9 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Nhap chuoi ki tu : ");
      String In = sc.nextLine();
      int Number = 0, LowerCase = 0, UpperCase = 0;
      for (int i = 0; i < In.length(); i++) {
         if (In.charAt(i) >= 'A' && In.charAt(i) <= 'Z') {
            UpperCase++;
         }
         if (In.charAt(i) >= 'a' && In.charAt(i) <= 'z') {
            LowerCase++;
         }
         if (In.charAt(i) >= '0' && In.charAt(i) <= '9') {
            Number++;
         }
      }
      System.out.println("Chu hoa : " + UpperCase);
      System.out.println("Chu thuong :" + LowerCase);
      System.out.println("So : " + Number);

   }
}