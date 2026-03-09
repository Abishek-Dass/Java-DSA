import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Duplicate {
   public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        Duplicate duplicate = new Duplicate();
        int[] nums = {1, 2, 3, 4, 5, 1};
        boolean result = duplicate.containsDuplicate(nums);
        System.out.println(result); 
    }
}