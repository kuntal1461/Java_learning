package interviewBite;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s= "racecar";
        String t= "carrace";

        boolean isAnagram = checkAnagram(s,t);

        if (isAnagram) {
            System.out.println("it is Anagram ");
        }
        else{
            System.out.println("it is  not Anagram ");
        }
    }

    private static boolean checkAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
       char[] sArray = s.toCharArray();
       char[] tArray= t.toCharArray();
       Arrays.sort(sArray);
        Arrays.sort(tArray);

        return (Arrays.equals(sArray,tArray));
    }

    
}
