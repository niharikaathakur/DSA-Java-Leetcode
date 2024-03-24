package LinearSearch;

public class linearsearch {
    public static void main(String[] args){
        int[] arr = {2,7,4,3,8,6};
        int target =8;
        System.out.println(linearSearch(arr,target));
    }

    static int linearSearch(int[] arr,int target){
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }
}
