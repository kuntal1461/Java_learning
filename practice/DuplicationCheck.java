import java.util.Arrays;

public class DuplicationCheck {
    
    public static void main(String[] args) {
      int [] nums = {1, 2, 3, 3};


      boolean isDuplicate = checkDuplication(nums);

      if (isDuplicate) {
        System.out.println("This is duplicate");
      }
      else{
        System.out.println("it is not duplicate" );
      }
    }

    private static boolean checkDuplication(int[] num) {
        
      return  Arrays.stream(num).distinct().count()<num.length;
    }
}
