class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count = 0;

        for(int i = 0; i<nums.length; i++){
            count+=nums[i];
            max = Math.max(count,max);
            count = count<0?0:count;
        }

        return max;
    }
}