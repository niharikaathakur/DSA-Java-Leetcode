package BinarySearch;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'x','x','y','y'};
        char target = 'z';
        System.out.println(binarySearch(arr,target));
    }
    static char binarySearch(char[] arr,int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            //find middle element
            //int mid = (start+end)/2; might be possible (start+end) exceeds the integer_max value
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else {
                end =mid-1;
            }
        }
        return arr[start%arr.length];
    }
}
