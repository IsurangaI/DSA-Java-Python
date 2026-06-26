package src.main.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumSolution {
    // Input: nums = [2,7,11,15], target = 9


    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int start = i;
                int end = j;
                int sum = nums[start] + nums[end];

                if (sum == target) {
                    return new int[] { start, end };
                }
            }
        }
        return nums;
    }


}