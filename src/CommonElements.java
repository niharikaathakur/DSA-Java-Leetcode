import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of all arrays");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        System.out.println("Enter array elements for a:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter array elements for b:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == b[j]) {
                    c[count] = a[i];
                    count++;
                }
            }
        }
System.out.println("C Array is:");
        for (int i = 0; i < count; i++) {
                System.out.println(c[i]);
        }

    }
}