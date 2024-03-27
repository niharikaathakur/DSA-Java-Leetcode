//Find First and Last Position of Element in Sorted Array
//Use binary search twice - complexity remains same
package BinarySearch;


import java.util.Arrays;

public class FandLposition {
    public static void main(String[] args) {
       int[] nums = {2,3,5,5,5,6,7,8,8,8};
       int target = 5;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    //this function just returns the index value of target
    static int search(int[] nums,int target,boolean firstStartIndex){
        int ans = -1;
        int start =0;
        int end =nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<nums[mid]){
                end = mid-1;
            }
            else if(target>nums[mid]){
                start = mid+1;
            }
            else {
                ans = mid;
                if(firstStartIndex){
                    end = mid-1;
                }
                else start=mid+1;
            }
        }
        return ans;
    }
}
