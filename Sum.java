import java.util.Scanner;
class Sum{
public static void main(String... args){
Scanner s = new Scanner(System.in);
System.out.print("Enter the 1st number:");
int a = s.nextInt();
System.out.print("Enter the 2nd number:");
int b = s.nextInt();
int sum=0;
for(int i=a;i<=b;i++){
sum=sum+i;
}
System.out.print("The answer is : " +sum);
}
}
