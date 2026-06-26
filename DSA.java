import src.main.java.TwoSumSolution;

import java.util.Arrays;

public class DSA {
    public static void main(String[] args) {
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        int[] nums = {3,2,3};
        int target = 6;

        System.out.println(Arrays.toString(twoSumSolution.twoSum(nums, target)));

    }
}