import java.util.HashSet;
public class Duplicate {
   public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
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