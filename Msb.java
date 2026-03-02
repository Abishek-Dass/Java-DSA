import java.util.Scanner;
class Msb{
public static void main(String... args){
Scanner s = new Scanner(System.in);
System.out.print("Enter the  number:");
int n = s.nextInt();
while(n>=10){
n=n/10;
}
System.out.print("The MSB is : " +n);
}
}
