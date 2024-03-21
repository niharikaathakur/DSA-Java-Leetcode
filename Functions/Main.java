package Functions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static void matrixRead(int[][] mat){
        for (int i = 0; i < mat.length; ++i) {
            for(int j = 0; j < mat[i].length; ++j) {
                mat[i][j] = sc.nextInt();
            }
        }
    }
    public static void main(String[] args){

        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        int[][] c = new int[row][col];

        matrixRead(a);
        matrixRead(b);
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                c[i][j]=a[i][j]+b[i][j];
            }
            System.out.println();
        }

        for (int i = 0; i < b.length; ++i) {
            for(int j = 0; j < b[i].length; ++j) {
                System.out.println(c[i][j]);
            }
        }
    }
}
