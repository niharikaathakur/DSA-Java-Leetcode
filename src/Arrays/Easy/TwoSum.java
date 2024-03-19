
//1. Two Sum - Improving complexity using hashmap

package Arrays.Easy;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int[] result = twoSum(arr,9);
        for (int j : result) {
            System.out.println(j);
        }
    }

    static public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> complements = new HashMap<>();
        int n =nums.length;
        for(int i=0;i<n;i++){
            int complement = target - nums[i];
            if(complements.containsKey(complement)){
                return new int[]{complements.get(complement),i};
            }
            complements.put(nums[i],i);
        }
        return new int[]{};
    }
}


/*
nums = {5,2,4}
target = 6
Hashmap
K -> v
1 -> 0 check if the key already exists in the map
4 -> 1     4 also exists as a key so for next iteration we consider it for adding
ans -> {2,1} , index we're looking at and the number in key
 */