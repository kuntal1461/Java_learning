public class main {
    
    public static void main(String[] args) {
        
        String s = "Was it a car or a cat I saw?";

        checkPlindrom(s);

    }

    private static boolean checkPlindrom(String s) {

        StringBuilder newString = new StringBuilder();
        for(int i=0;i<s.length();i++){
           char charofS = s.charAt(i);
            if (Character.isLetterOrDigit(charofS)) {
                newString.append(Character.toLowerCase(charofS));
                
            }
        }
        String reverseString = newString.reverse().toString();
        return newString.toString().equals(reverseString);

    }
}
