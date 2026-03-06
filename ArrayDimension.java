import java.util.Arrays;
import java.util.Scanner;
public class ArrayDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.print("Enter the elements of the array: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2D array is: ");
        for(int i=0; i<rows; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}