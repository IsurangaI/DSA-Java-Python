package src.main.java;

import java.util.Arrays;

public class MergeSortedArray {


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m+n];
        if (nums2.length == 0) {
            return;
        }

        for (int i = 0; i < nums1.length; i++) {
            if (i == nums2.length) {
                break;
            }
            if (nums1[i] < nums2[i]) {

            } else {

            }


        }
        System.out.print(Arrays.toString(merged));

    }


}
