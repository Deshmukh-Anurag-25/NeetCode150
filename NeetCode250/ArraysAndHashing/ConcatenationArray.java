package ArraysAndHashing;

import java.util.Arrays;

public class ConcatenationArray {
    public static int[] concatenate(int[] nums){
        int n = nums.length;
        int[] result = new int[2*n];
        for(int i = 0; i < n; i++){
            result[i] = nums[i];
            result[n+i] = nums[i];
        }

        return result;
    }

    public static void main(String[] args){
        int[] nums = {1, 4, 1, 2};
        System.out.println(Arrays.toString(concatenate(nums)));
    }
}
