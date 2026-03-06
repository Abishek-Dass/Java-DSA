
import java.util.Arrays;
public class Reverse{
    public static void main(String[] args){
        int[] arr = {5,10,15,20,30,45};
        int[] temp = new int[arr.length];
        int k = 0;
        System.out.println("Original array: " + Arrays.toString(arr));
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] % 2 == 0){
                temp[k++] = arr[i];
            }
        }
        int[] result = Arrays.copyOf(temp,k);
        System.out.println("Reversed array: " + Arrays.toString(result));
    }
}