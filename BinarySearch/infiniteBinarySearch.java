package BinarySearch;

public class infiniteBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr,int target){
        //first find range
        //first start with a box of size 2
        int start =0;
        int end = 1;
        while(target>arr[end]){
            int temp = end+1;
            //double the box value
            end  = end+(end-start+1)*2;
            start =temp;
        }
        return binarysearch(arr,target,start,end);
        //condition for target to lie in the range

    }

    static int binarysearch(int[] arr, int target ,int start ,int end){
        while(start<=end){
            //find middle element
            //int mid = (start+end)/2; might be possible (start+end) exceeds the integer_max value
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else {
                end =mid-1;
            }
        }
        return -1;
    }

}
