import java.util.Arrays;
class Plus_one{
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n = arr.length;
        for (int i = n-1; i >= 0; i--) {
            if(arr[i] < 9){
                arr[i]++;
                break;
            }
            else{
                arr[i] = 0;
            }
        }
        if(arr[0] == 0){
            int[] newArr = new int[n+1];
            newArr[0] = 1;
            System.out.println(Arrays.toString(newArr));
        }
        else{
            System.out.println(Arrays.toString(arr));
        }
    }
}