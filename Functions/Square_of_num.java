package Functions;

import java.util.Scanner;

public class Square_of_num {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = square(n);
        System.out.println("Square of "+n+" is: "+ result);
}
static int square(int a){
    return a*a;
    }
}
