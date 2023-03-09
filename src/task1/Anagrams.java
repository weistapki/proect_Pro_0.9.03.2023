package task1;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        Solution solution = new Solution();
        System.out.println(solution.isAnagram(s,t));
    }
    static class Solution {
        public boolean isAnagram(String s, String t) {
            if(s.length()!=t.length()){
                return false;
            }else{
                char[]a = s.toCharArray();
                char[]b = t.toCharArray();
                Arrays.sort(a);
                Arrays.sort(b);
                return Arrays.equals(a,b);
            }
        }
    }
}
