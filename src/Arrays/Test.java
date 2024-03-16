package Arrays;

public class Test {
    public static void main(String[] args ){
        int result = WorkLeft(50,5,2,7,3);
        System.out.println(result);
    }
    static int WorkLeft(int work, int f1,int d1,int f2,int d2){
        return (work-(f1*d1+f2*d2));
    }
}
