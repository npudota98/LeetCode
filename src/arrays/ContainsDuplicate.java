package arrays;


import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 242 - Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 *
 * Approach: Character frequency count (fixed-size array)
 * Time: O(n)
 * Space: O(1) — bounded by 26 lowercase letters
 */

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}
