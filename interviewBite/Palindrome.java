package interviewBite;

public class Palindrome {
    

    public static void main(String[] args) {
        String  s = "Was it a car or a cat I saw?";

        boolean isPalinDrom = checkPalindrome(s);
        if (isPalinDrom) {
            System.out.println("it is Palindrome ");
        }
        else{
            System.out.println("it is  not Palindrome ");
        }

    }

    private static boolean checkPalindrome(String s) {
       
        StringBuilder string = new StringBuilder();

        for(int i=0; i <s.length();i++){
             char charS = s.charAt(i);
            if (Character.isLetterOrDigit(charS)) {
                string.append(Character.toLowerCase(charS));
            }
             
        }

        String reverseString = string.reverse().toString();
        return string.toString().equals(reverseString);
    }
}
