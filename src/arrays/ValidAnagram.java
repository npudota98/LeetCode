package arrays;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] charS = new int[26];
        int[] charT = new int[26];
        for(char c: s.toCharArray()){
            charS[c - 'a']++;
        }
        for(char c: t.toCharArray()){
            charT[c - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(charS[i] != charT[i]){
                return false;
            }
        }
        return true;
    }
        public static void main(String[] args) throws Exception {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(new ValidAnagram().isAnagram(s, t));
    }
}
