import java.util.Scanner;
class Days{
public static void main(String... args){
Scanner s = new Scanner(System.in);
System.out.print("Enter the num of Days:");
int a = s.nextInt();
System.out.println("Hours = " +(a*24)+" "+"Minutes = " +(a*24*60)+" "+ "Seconds = " +(a*24*60*60));
}
}