package Strings;


public class OrderAgnosticBS {
    public static void main(String[] args)
    {
        int[] arr={455,65,43,22,1};
        int target=455;
        System.out.println(OrderAgnosticBinarySearch(arr,target));
    }
    static int OrderAgnosticBinarySearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end)
        {
            int mid=start +(end - start)/2;

            if(arr[mid]==target)
            {
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    end = arr[mid] - 1;
                } else  {
                    start = arr[mid] + 1;
                }
            }
            else{
                if (target < arr[mid]) {
                    start = arr[mid] + 1;
                } else  {
                    end = arr[mid] - 1;
                }
            }

        }
        return -1;
    }
}