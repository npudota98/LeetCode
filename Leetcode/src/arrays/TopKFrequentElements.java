package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int n :nums){
            count.put(n,count.getOrDefault(n,0)+1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> count.get(a) - count.get(b));
        for(int n :count.keySet()){
            minHeap.add(n);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = minHeap.poll();
        }
        return res;
    }

    public int[] topKFrequentBucketSort(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for(int n :nums){
            count.put(n,count.getOrDefault(n,0)+1);
        }
        for(int n :count.keySet()){
            bucket[count.get(n)].add(n);
        }
        int[] res = new int[k];
        int index = 0;
        for(int i = bucket.length-1; i > 0 && index < k; i--){
            for(int n : bucket[i]){
                res[index] = n;
                index++;
                if(index == k){
                    return res;
                }

            }
        }
        return res;

    }


    public static void main(String[] args) throws Exception {
        int[] nums = { 1, 2, 2, 3, 3, 3 };
        int k = 2;
        int[] result = new TopKFrequentElements().topKFrequent(nums, k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
