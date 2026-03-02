import java.util.Scanner;
class Weird{
public static void main(String... args){
Scanner s = new Scanner(System.in);
System.out.print("Enter the number: ");
int n = s.nextInt();
if(n%2!=0){
System.out.println("Weird");
}
if(n>=2 && n<=5){
System.out.println("Not Weird");
}
if(n>=6 && n<=20){
System.out.println("Weird");
}
else{
System.out.println("Not Weird");
}
}
}
