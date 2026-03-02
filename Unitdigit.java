import java.util.Scanner;
class Unitdigit{
public static void main(String... args){
Scanner s = new Scanner(System.in);
System.out.print("Enter the  number:");
int a = s.nextInt();
System.out.print("The unit digit is : " +(a%10));
}
}
