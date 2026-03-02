public class Palindrome {
    public static void main(String[] args) {
        String str = "mambmam";
        for(int i=0; i<str.length()/2; i++){
            char start = str.charAt(i);
            char rev = str.charAt(str.length()-1-i);
            if(start != rev){
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}