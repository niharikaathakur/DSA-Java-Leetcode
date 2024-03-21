package Functions;

public class matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100, 110, 120}
        };
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.println(arr[j][i]);
            }
            System.out.println();
        }
    }
}