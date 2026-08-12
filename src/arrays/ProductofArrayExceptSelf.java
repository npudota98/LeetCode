import java.util.Arrays;

public class ProductofArrayExceptSelf {
    //naive
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++ ){
            int product = 1;
            for(int j = 0; j < nums.length; j++){
                if(i == j){
                    continue;
                }
                product = product * nums[j];
            }
            res[i] = product;
        }
        return res;
    }
    //optimized
    public int[] productExceptSelfOptimized(int[] nums) {
        int[] res = new int[nums.length];
        int[] suffix = new int[nums.length];
        Arrays.fill(suffix, 1);
        int[] prefix = new int[nums.length];
        Arrays.fill(prefix, 1);
        for(int i = 1; i < nums.length; i++ ){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        for(int i = nums.length-2; i >= 0; i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        for(int i = 0; i < nums.length; i++ ){
            res[i] = prefix[i] * suffix[i];
        }
        return res;
    }

    //optimized for space too
    public int[] productExceptSelfOptimizedSpace(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res,1);
        for(int i = 1; i < nums.length; i++ ){
            res[i] = res[i-1] * nums[i-1];
        }
        int suffix = 1;
        for(int i = nums.length-2; i >= 0; i--){
            suffix = suffix * nums[i+1];
            res[i] = res[i] * suffix;
        }
        return res;
    }


    public static void main(String[] args) throws Exception {
        int[] nums = { 1,2,3,4 };
        int[] result = new ProductofArrayExceptSelf().productExceptSelfOptimizedSpace(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
