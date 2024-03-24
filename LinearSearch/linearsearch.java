package LinearSearch;

public class linearsearch {
    public static void main(String[] args){
        int[] arr = {2,7,4,3,8,6};
        System.out.println(linearSearch(arr,6));
    }

    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            if(element==target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}
