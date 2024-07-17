class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int[] arr = swap(nums,0,nums.length-1);
        swap(arr,0,k-1);
        swap(arr,k,arr.length-1);
    }

    int[] swap(int[] nums,int i, int j){
        int t = 0;
        while(i<=j){
            t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
        return nums;
    }
}