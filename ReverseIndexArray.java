import java.util.*;
public class ReverseIndexArray {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50, 60, 70, 80};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index to reverse: ");
        int d = sc.nextInt();

        for(int i=d; i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        for(int i=n-1; i>d; i--){
            System.out.print(arr[i] + " ");
        }
    }
}