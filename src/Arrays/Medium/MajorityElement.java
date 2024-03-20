//169 Majority Element using hashmap(Better Approach)

package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }
    public static int majorityElement(int[] nums){
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            int value = map.getOrDefault(num, 0);
            map.put(num, value + 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>n/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}

/*
Time Complexity Analysis
Map has a complexity of LogN .We are using it for N times thus
it becomes NlogN
The second for loop has a complexity of N for checking the value greater than
floor value
Thus the overall time complexity is O(N*LogN)+O(N)
 */