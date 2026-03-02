import java.util.Scanner;
public class Gst{
   public static void main(String... args){
      Scanner sc = new Scanner(System.in);
      Double pdt_price = sc.nextDouble();
      Double Percentage = 9.0;
      Double CGST = ((pdt_price * 9.0)/2)/100;
      Double SGST = ((pdt_price * 9.0)/2)/100;
      Double to_pay = pdt_price + CGST + SGST;
      System.out.println(to_pay);
}
}
      