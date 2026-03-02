import java.util.Scanner;
public class percentage{
   public static void main(String... args){
      Scanner sc = new Scanner(System.in);
      int total = 0;
      for(int i=1; i<=5; i++)
      total += sc.nextInt();
      System.out.println("Total " +total); 
      double percent = (total/500.0)*100;
      System.out.printf("The percentage of five subject is %.1f%%" , percent);

}
}