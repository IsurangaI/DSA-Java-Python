package java;

import org.testng.internal.MethodGroupsHelper;
import src.main.java.MergeSortedArray;
import src.main.java.TwoSumSolution;

import java.util.Arrays;

public class DSA {
    public static void main(String[] args) {
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSumSolution.twoSum(nums, target)));

//
//        MergeSortedArray mergeSortedArray = new MergeSortedArray();
//        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {2,5,6};
//        int m = 3;
//        int n = 3;
//
//        mergeSortedArray.merge(nums1,m,nums2,n);

    }
}