import java.util.Scanner;
class Count_words{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = s.nextLine();
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                c++;
            }
            
        }
        System.out.println("Count: " + c);
    }
}
