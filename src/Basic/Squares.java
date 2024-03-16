package Basic;

import java.util.Scanner;


public class Squares {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = (int) Math.pow(i+1,2);
        }

        for(int i=0;i<N;i++){
            System.out.println(arr[i]);
        }


    }
}
