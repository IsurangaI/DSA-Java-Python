package src.main.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {
    // Input: nums = [2,7,11,15], target = 9


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            // substract the number from target and place the i value and compliment in  map {[compliment:position]}
            //when iterating if you see the substraction in the map pick the position from map return that position with current i

            int substraction = target - nums[i];
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.putIfAbsent(substraction, i);
            }
        }
        return nums;
    }


}