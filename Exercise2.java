import java.util.Scanner;
public class Exercise2{
   public static void main(String... args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int decimal = n;

      System.out.println("Decimal value " + n);
      System.out.println("Octal value " + Integer.toOctalString(n));
      System.out.println("Hexadecimal value " + Integer.toHexString(n));

}
}