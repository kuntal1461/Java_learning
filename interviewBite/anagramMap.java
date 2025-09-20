package interviewBite;

import java.util.HashMap;

public class anagramMap {
    

    public static void main(String[] args) {
        
        String s= "racecar";
        String t= "carrace";

       boolean isanagramMap = checkanagramMap(s,t);

       if (isanagramMap) {
            System.out.println("it is Anagram ");
        }
        else{
            System.out.println("it is  not Anagram ");
        }
    }

    private static boolean checkanagramMap(String s, String t) {
       
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character,Integer> sHashMap= new HashMap<>();
        HashMap<Character,Integer> tHashMap= new HashMap<>();

        for(int i=0; i <s.length();i++){

            sHashMap.put(s.charAt(i), sHashMap.getOrDefault(s.charAt(i), 0) + 1);
            tHashMap.put(t.charAt(i),tHashMap.getOrDefault(t.charAt(i),0)+1);
        }

        return sHashMap.equals(tHashMap);
    }
}
