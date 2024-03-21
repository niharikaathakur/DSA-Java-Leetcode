//268. Missing Number
package Arrays.Easy;

public class MissingNumber {
    public static void main(String[] args){
        int[] arr = {0,3,1};
        System.out.println(missingNumber(arr));
    }
    static public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = ans ^ i;
        }
        for (int num : nums) {
            ans = ans ^ num;
        }
        return ans;
    }
}
