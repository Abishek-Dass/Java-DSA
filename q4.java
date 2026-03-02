import java.util.Scanner;
class q4
{
    public static void main(String args[])
    {    
    Scanner scan = new Scanner(System.in);
    String name=scan.nextLine();
    double score=scan.nextDouble();
    scan.nextLine();
    String dep=scan.nextLine();
    System.out.println("My name is "  + name);
    System.out.println("My score is "  + score/10);
    System.out.print("My dep is "  + dep);
   }
}