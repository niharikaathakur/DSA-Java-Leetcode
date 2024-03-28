package BinarySearch;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        int target =2;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnostic(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnostic(arr,target,peak+1,arr.length-1);
    }
    static int orderAgnostic(int[] arr,int target, int start,int end){

        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            //find middle element
            //int mid = (start+end)/2; might be possible (start+end) exceeds the integer_max value
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;
        while(start<end){
            //find middle element
            //int mid = (start+end)/2; might be possible (start+end) exceeds the integer_max value
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in descending part of the array
                //this may be the ans ,but we need to look on th left side
                //this is why end!=mid-1;
                end = mid;
            }
            else {
                //you are in ascending part of the array
                start = mid+1; //because we know mid+1 is greater than mid element
            }

            //start == end and pointing to the largest number
        }
        return start;
    }
}
