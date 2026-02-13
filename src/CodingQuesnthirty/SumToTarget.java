package CodingQuesnthirty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumToTarget {

    // Two Sum: Given an array of integers, find all pairs of two numbers that add up to a specific
    //   target=7
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};

        int leftPointer = 0;
        int rightPointer = nums1.length - 1;
        int sum = 0;
        int target = 7;
        int[] res = null;
        List<int[]> res1 = new ArrayList<>();

        while (leftPointer < rightPointer) {
            sum = nums1[leftPointer] + nums1[rightPointer];
            if (sum == target) {
                // res =new int[]{leftPointer,rightPointer};//pair 1 found
                res1.add(new int[]{leftPointer, rightPointer});

                leftPointer++;
                rightPointer--;


            } else if (sum > target) {
                rightPointer--;

            } else if (sum < target) {
                leftPointer++;

            }

        }
        res1.stream().forEach(x -> System.out.println(Arrays.toString(x)));
    }
}
