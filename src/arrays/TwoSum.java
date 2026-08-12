import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                result[0] = map.get(target-nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result =  new TwoSum().twoSum(nums,target);
        System.out.println(result[0] + ", " + result[1]);
    }
    
}

