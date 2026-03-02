import java.util.Scanner;
class Taxi{
public static void main(String... args){
Scanner s = new Scanner(System.in);
System.out.print("Enter the Taxi number:");
String t  = s.nextLine();
System.out.print("Enter Distance covered:");
int km = s.nextInt();
int total = 0;
if(km>=5){
total = 100;
}
if(km>5 && km<=10){
total = 100+(km - 5)*10;
}
if(km>15 && km<25){
total = 200+(km - 15 )*8;
}
if(km > 25){
total = 280+(km - 25)*5;
}
System.out.println("Taxi number:" +t);
System.out.println("Distance Covered:" +km);
System.out.println("Amount:" +total);
}
}
