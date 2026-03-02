import java.util.*;
public class Array_Sum{
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("The sum of the array is: " + sum);
    }
}