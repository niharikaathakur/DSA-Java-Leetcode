package Strings;

public class SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I like Programming");
        sb.append(" and coffee");
        System.out.println(sb);

        sb.insert(18,", gaming");
        System.out.println(sb);

        sb.replace(2,6,"love");
        System.out.println(sb);

        sb.delete(7,20);
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);

    }
}
