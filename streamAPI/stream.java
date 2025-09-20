package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream {

    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // want the name which have 3 letters more

        System.out.println(names.stream().filter(x->x.length()>3).collect(Collectors.toList()));
        // squaring and sorting the number 

        List<Integer> numbers = Arrays.asList(5, 2);

        System.out.println(numbers.stream().map(x->x*x).sorted().collect(Collectors.toList()));
    
        // sum of all the numbers

        List<Integer> num = Arrays.asList(5, 2, 8, 1, 3);

        System.out.println(num.stream().map(x->x+x).sorted().collect(Collectors.toList()));
    }
    

}
