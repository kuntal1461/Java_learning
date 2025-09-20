package streamapipractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streampractice {

    public static void main(String[] args) {
        
        List<Integer> numIntegers= Arrays.asList(1,2,23,4,4,5,7,4);

        // find the even no 
       System.out.println( numIntegers.stream().filter(x->x%2==0).collect(Collectors.toList()));
        
       // even no with distict

       System.out.println(numIntegers.stream().filter(x->x%2==0).distinct().collect(Collectors.toList()));
   
    }
    
}
