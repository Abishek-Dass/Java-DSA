import java.util.*;
class Complex_Num_multiply {
    public static String complexNumberMultiply(String num1, String num2) {
        String[] parts1 = num1.split("\\+");
        String[] parts2 = num2.split("\\+");

        int a = Integer.parseInt(parts1[0]);
        int b = Integer.parseInt(parts1[1].replace("i", ""));

        int c = Integer.parseInt(parts2[0]);
        int d = Integer.parseInt(parts2[1].replace("i", ""));

        int real = a * c - b * d;
        int imaginary = a * d + b * c;

        return real + "+" + imaginary + "i";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String part1 = sc.nextLine();
        String part2 = sc.nextLine();

        String result = complexNumberMultiply(part1 , part2);
        System.out.println(result);
    }
}