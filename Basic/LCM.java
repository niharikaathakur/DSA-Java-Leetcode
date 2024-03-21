package Basic;

import java.lang.*;
import java.util.*;

public class LCM {

    static int gcd(int a, int b) {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // Base case
        if (a == b)
            return a;

        // a is greater
        if (a > b) {
            if (a % b == 0)
                return b;
            return gcd(a - b, b);
        }
        if (b % a == 0)
            return a;
        return gcd(a, b - a);
    }
        public static void main (String[]args){
            // YOUR CODE GOES HERE
            // Please take input and print output to standard input/output (stdin/stdout)
            // DO NOT USE ARGUMENTS FOR INPUTS
            // E.g. 'Scanner' for input & 'System.out' for output
            Scanner scanner = new Scanner(System.in);
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int result = (A/gcd(A, B) * B);
            System.out.println(result);
        }
}
