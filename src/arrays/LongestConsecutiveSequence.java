import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int res = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        for(int n:nums){
            int max = 1;
            int end = n;
            while(set.contains(end-1)){
                max++;
                end--;
                res = Math.max(max, res);
            }
        }
        return res;
    }

    public int longestConsecutiveOptimized(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int res = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        for(int n: set){
            int max = 1;
            if(set.contains(n-1)){
                continue;
            }
            int start = n;
            while(set.contains(start+1)){
                max++;
                start++;
                res = Math.max(res,max);
            }
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        int[] nums = {100,4,200,1,3,2};
        int result = new LongestConsecutiveSequence().longestConsecutiveOptimized(nums);
        System.out.println(result);

    }
}