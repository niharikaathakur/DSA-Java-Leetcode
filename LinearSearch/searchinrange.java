package LinearSearch;

public class searchinrange {
    public static void main(String[] args){
        int[] arr = {2,7,4,3,8,6};
        System.out.println(linearSearchinrange(arr,3,1,4));
    }
    static int linearSearchinrange(int[] arr,int target,int start,int end){
        for(int i=start;i<end;i++){
            int element = arr[i];
            if(element==target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}
