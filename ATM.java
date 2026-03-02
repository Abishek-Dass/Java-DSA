import java.util.Scanner;
public class ATM{
   public static void main(String... args){
      Scanner sc = new Scanner(System.in);
      	int Hundred = sc.nextInt();
	int fiveHund = sc.nextInt();
	int thousand = sc.nextInt();
	int total = (Hundred * 100 + fiveHund * 500 + thousand * 1000);
	System.out.println(total);
}
}