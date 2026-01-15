import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    private int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int moreNeeded = target - nums[i];
            if(map.containsKey(moreNeeded)){
                return new int[] {i, map.get(moreNeeded)};
            }

            map.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args){
        TwoSum obj1 = new TwoSum();
        int[] nums = {2, 7, 9, 11};
        System.out.println(Arrays.toString(obj1.twoSum(nums, 9)));
        System.out.println(Arrays.toString(obj1.twoSum(nums, 15)));
    }
}
