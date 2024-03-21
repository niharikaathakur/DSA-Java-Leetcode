package Functions;

public class isPalindromecheck {
    public void isPalindrome(String s) {
        s =" A man, a plan, a canal: Panama";
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Java Regex - Regular expression
        int n = s.length() ;
        System.out.println(check(0, n, str));
    }
    public static boolean check(int i, int j, String s) {
        if (i >= j/2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(j-i-1)) {
            return false;
        }

        return check(i + 1, j - 1, s);
    }
}
