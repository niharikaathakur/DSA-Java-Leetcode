package Basic;

public class MinMax {
    public static void main(String[] args){
        int[] arr = {1,6,4,8,3,9};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Minimum value in array is: "+min);
        System.out.println("Maximum value in array is: "+max);

    }
}
