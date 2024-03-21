//485. Max Consecutive Ones
package Arrays.Easy;

public class findMaxConsecutiveOnes {
    public static void main(String[] args){
        int[] arr = {1,1,1,1,0,1,1,0,0,1,1,1,1,1};
        System.out.println(ConsecutiveOnes(arr));
    }
    static public int ConsecutiveOnes(int[] nums) {
        int count=0;
        int temp=0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                if (temp < count) {
                    temp = count;
                }
                count = 0;
            }
        }
        if(temp<count){
            temp=count;
        }
        return temp;
    }
}
