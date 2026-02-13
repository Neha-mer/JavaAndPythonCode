package JavaCoding;

import java.util.Arrays;

public class FindSecondLargestClass {

    public static void main(String[] args) {
        int[] arr={1,7,5,9,3};
        int n=arr.length;


        Arrays.sort(arr);

        for(int i=n-1;i>0;i--)
        {
            if(i==n-2)
            {
                int x=arr[n-2];

                System.out.println("x is"+x);
            }
        }



    }
}
