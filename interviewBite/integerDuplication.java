package interviewBite;

import java.util.Arrays;

public class integerDuplication {

    public static void main(String[] args) {
        
       int[] num = {1,2,3,4,2,2,3,4,5,7};

       boolean isDuplicate = duplicateIntegerCheck(num);

       boolean isDuplicateStream= duplicateIntegerCheckstram(num);
       if (isDuplicate) {
        System.out.println("This is the duplicate");
       }
       else{
        System.out.println("Not Duplicate");
       }

       if (isDuplicateStream) {
        System.out.println("This is the duplicate in stram app");
       }
       else{
        System.out.println("Not Duplicate stream");
       }

    }

    private static boolean duplicateIntegerCheck(int[] num) {

        Arrays.sort(num);

       for(int i=1; i <num.length;i++){
            if(num[i]==num[i-1]){
               return true;
            }
       }
        return false;

    }

    private static boolean duplicateIntegerCheckstram(int[] nums){
       return Arrays.stream(nums).distinct().count()<nums.length;
        

    }
    
}
