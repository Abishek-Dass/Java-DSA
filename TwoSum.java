import java.util.Arrays;
import java.util.HashMap;import java.util.Map;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            int result = target - nums[i];
            if(map.containsKey(result)){
                int[]  arr = {map.get(result), i};
                System.out.println(Arrays.toString(arr));
            }
            map.put(nums[i], i);
        }
    }
}