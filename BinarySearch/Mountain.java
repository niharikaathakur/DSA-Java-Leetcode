package BinarySearch;

public class Mountain {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
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
