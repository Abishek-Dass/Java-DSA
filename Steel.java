import java.util.Scanner;
class Steel{
public static void main(String... args){
Scanner s = new Scanner(System.in);
System.out.print("Enter the hardness:");
int h = s.nextInt();

System.out.print("Enter the Carbon content:");
float c = s.nextFloat();

System.out.print("Enter the tensile strength :");
int ts = s.nextInt();

if(h>60 && c>0.8 && ts>5700){
System.out.println("Class A");
}
if(h>60 && c>0.8){
System.out.println("Class B");
}
if(h>60 && ts>5700){
System.out.println("Class C");
}
if(c>0.8 && ts>5700){
System.out.println("Class D");
}
if(c>0.8 || h>60 || ts>5700){
System.out.println("Class E");
}
else{
System.out.println("Class F");
}
}
}
