import java.util.Scanner;
public class Percentage1{
   public static void main(String... args){
      Scanner sc = new Scanner(System.in);
      
      	System.out.print("Enter the m1: " );
      	int m1 = sc.nextInt();
      
	System.out.print("Enter the m2: " );
      	int m2 = sc.nextInt();
	
	System.out.print("Enter the m3: " );
      	int m3 = sc.nextInt();
	
	System.out.print("Enter the m4: " );
      	int m4 = sc.nextInt();
	
	System.out.print("Enter the m5: " );
        int m5 = sc.nextInt();

	if(m1 > 100 || m2 > 100 || m3>100 || m4>100 || m5>100){
        System.out.println("The given mark shhould not exceed 100");
}
else{
int aggregate = m1 + m2 + m3 + m4 + m5;
double percentage = (aggregate)/5;

System.out.println("The aggregate is : " +aggregate);
System.out.println("The aggregate is : " +percentage+ "%");
}
}

}

