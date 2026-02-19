package CodingQuesnthirty;

import java.util.Arrays;

public class MergeTwoSortedArray {

    //[2,3,5,0,0,0] length=6
    //[2,3,4]
    //two pointer

    public static void main(String[] args) {

        int[] arr1 = {4, 5, 6, 0, 0, 0};
        int[] arr2 = {1, 3, 4};
        int m = 3;
        int n = 3;

        int index = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {

            if (arr1[i] < arr2[j]) {
                arr1[index] = arr2[j];
                index--;
                j--;

            } else {
                arr1[index] = arr1[i];
                index--;
                i--;
            }
        }

        while (j >= 0) {
            arr1[index] = arr2[j];
            index--;
            j--;
        }
        Arrays.stream(arr1).forEach(System.out::println);
       

    }
}
