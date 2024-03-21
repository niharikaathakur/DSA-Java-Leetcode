//Kadane's Algorithm
package Arrays.Medium;
public class maxsubarray2 {
    public static int maxSubarraySum(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int sum=0;
        for (int num : nums) {

            sum += num;
            if (sum > maxi) {              // sum = sum>max?sum:max;
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
        return maxi;

    }

    public static void main(String[] args) {
        int[] arr = { -2, -1};
        int maxSum = maxSubarraySum(arr);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }
}



