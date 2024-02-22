
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1};
        int key = 2;
        boolean found = false;
        for(int num :arr){
            if (key == num) {
                found = true;
                break;
            }
        }
        if(found) System.out.println("Found");
        else System.out.println("Not Found");
    }
}