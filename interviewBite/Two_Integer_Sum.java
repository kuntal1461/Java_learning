package interviewBite;

import java.util.Arrays;

public class Two_Integer_Sum {

    public static void main(String[] args) {
        
        int [] nums= {1,2,3,4,5,6,9};
        int target=8;

        int[] result = checkTheNum(nums,target);

        System.out.println( "the result is "+Arrays.toString(result));


    }
    private static int[] checkTheNum(int[] nums, int target) {

        int i=0;
        int j= nums.length-1;

        while (i<j) {

           int currentSum = nums[i]+nums[j];

           if (currentSum>target) {
            j--;
           }
           else if (currentSum<target) {
            i++;
           }
           else{
            return new int[] {nums[i],nums[j]};
           }
           
        }
        return new int[0];

    }
    
}
