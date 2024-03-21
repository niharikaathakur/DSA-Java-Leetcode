//Brute Force Approach
package Arrays.Medium;
public class maxsubarray1 {
        public static int maxSubarraySum(int[] arr, int n) {
            int maxi = Integer.MIN_VALUE; // maximum sum

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    // subarray = arr[i.....j]
                    int sum = 0;

                    //add all the elements of subarray:
                    for (int k = i; k <= j; k++) {
                        sum += arr[k];
                    }

                    maxi = Math.max(maxi, sum);
                }
            }

            return maxi;
        }

        public static void main(String[] args) {
            int[] arr = { -2, -1};
            int n = arr.length;
            int maxSum = maxSubarraySum(arr, n);
            System.out.println("The maximum subarray sum is: " + maxSum);

        }

    }


