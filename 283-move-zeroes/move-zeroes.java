class Solution {
    public void moveZeroes(int[] nums) {
        int sizeofzero = 0;

        for(int i =0; i<nums.length; i++){
            if(nums[i]==0){
                sizeofzero++;
            }
            else if(sizeofzero>0){
                int t = nums[i];
                nums[i] = 0;
                nums[i-sizeofzero] = t;
            }
        }
    }
}