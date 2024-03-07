package Strings;

public class Main {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");

        if(s1.equals(s3)){
            System.out.println("Equal");
        }
        else System.out.println("Not Equal");
    }
}
