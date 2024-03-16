package Arrays.Easy;

public class MoveZeros {



        public static void main(String[] args){
            int[] arr = {0,1,0,3,12};
            moveZeroes(arr);

        }
        static void moveZeroes(int[] nums) {
            int snowBallSize = 0;
            for (int i=0;i<nums.length;i++){
                if (nums[i]==0){
                    snowBallSize++;
                }
                else if (snowBallSize > 0) {
                    int t = nums[i];
                    nums[i]=0;
                    nums[i-snowBallSize]=t;
                }
            }
            for (int j : nums) {
                System.out.println(j);
            }
        }



}
