import java.util.Scanner;
public class Age{
   public static void main(String... args){
      Scanner sc = new Scanner(System.in);
System.out.println("Enter the Current date,month,year");
      	int cd = sc.nextInt();
	int cm = sc.nextInt();
	int cy = sc.nextInt();
System.out.println("Enter the birth date,month,year");
	int bd = sc.nextInt();
	int bm = sc.nextInt();
	int by = sc.nextInt();
int[] daysInMonth = { 31,28,31,30,31,30,31,31,30,31,30,31};
if(cd < bd){
cm = cm - 1;
cd = cd + daysInMonth[cm-1];
}

if(cm < bm){
cy = cy-1;
cm = cm + 12;
}

int day = cd - bd;
int month= cm - bm;
int year = cy - by;

System.out.println( year + " years " + month + " months " + day + " days ");
}
}
