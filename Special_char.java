import java.util.Scanner;
public class Special_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        str = str.replaceAll("\\s", ""); 
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                count++;
            }
        }
        System.out.println("The number of special characters in the string is: " + count);
    }
}