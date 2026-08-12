import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 271 - Encode and Decode Strings
 * https://leetcode.com/problems/encode-and-decode-strings/
 *
 * Approach: Encode by storing count and then just use substrings
 * Time: O(n)
 * Space: O(k) 
 */

public class EncodeandDecodeStrings {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for(String s: strs){
            result.append(s.length() + "#" + s);
        }
        return result.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()){
            int j = i;
            while(s.charAt(j) != '#'){
                j++;
            }
            int count = Integer.parseInt(s.substring(i, j));
            result.add(s.substring(j+1, count+j+1));
            s = s.substring(j+1+count, s.length());
        }
        return result;        
    }

    public static void main(String[] args) throws Exception {
        List<String> strs = new ArrayList<>();
        strs.add("");
        strs.add("");
        EncodeandDecodeStrings codec = new EncodeandDecodeStrings();
        String s = codec.encode(strs);
        System.out.println(s);
        List<String> decode = new ArrayList<>();
        decode = codec.decode(s);
        for(String str : decode){
            System.out.println(str);
        }
    }
}