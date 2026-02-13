public class FindNumberOfConsecutive {

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 0, 1};
        int max = 0;
        int count = 0;
        /// the ans here will be 3

        if (nums.length == 0) {
            count = 0;


        }

        for(int i = 1; i <nums.length; i++){
            if(nums[i]==nums[i-1]){
                count++;
               // max=nums[i];
            }
            else {
                max=Math.max(max,count);
                count=1;
                //count=0;
            }
        }

        System.out.println("count = " + Math.max(max,count));
    }
}