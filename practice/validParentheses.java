import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {
        
        String s = "()[]{}";

        isValid(s);
    }
    private static boolean isValid(String s) {
        Stack stack= new Stack<Character>();
        for(int i =0;i < s.length();i++){
           char newChar = s.charAt(i);

           if (newChar==('(') || newChar==('{') || newChar==('[')) {
            stack.push(newChar);
            
           }

           Character topChar = (Character) stack.pop();

           if (newChar =='(' & topChar != ')' ) {
                return false;
           }
           if (newChar =='{' & topChar != '}' ) {
                return false;
           }
           if (newChar =='[' & topChar != ']' ) {
                return false;
           }

        }
        return stack.isEmpty();
    }
    
}
