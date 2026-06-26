package src.test.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

import src.main.java.TwoSumSolution;

public class TwoSumSolutionTest {

    @Test
    void testTwoSumExample1() {
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    void testTwoSumExample2() {
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    void testTwoSumExample3() {
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    // Add more test cases as needed
}