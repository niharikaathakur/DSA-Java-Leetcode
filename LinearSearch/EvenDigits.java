package LinearSearch;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr ={555,901,482,1771};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums){
        int count =0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int i){
        int count=0;
        while(i>0){
            count++;
            i=i/10;
        }
        return count%2==0;
    }
}
