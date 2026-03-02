import java.util.Scanner;
class Fraction{
public static void main(String... args){
Scanner s = new Scanner(System.in);
System.out.print("Enter the 1st number:");
double sum = 0;
double n1 = s.nextDouble();
sum += n1 - (int)n1;
System.out.print("Enter the 2nd number:");
double n2 = s.nextDouble();
sum += n2 -(int)n2;
System.out.print("The sum is: " +sum);
}
}
 