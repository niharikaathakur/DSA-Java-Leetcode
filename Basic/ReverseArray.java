package Basic;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {1,6,4,8,3,9};
        int n =arr.length;
        int j=n;
        int[]b = new int[n];
        for (int k : arr) {
            b[j - 1] = k;
            j--;
        }
        for(int i=0;i<n;i++){
            System.out.println(b[i]);
        }
    }
}
