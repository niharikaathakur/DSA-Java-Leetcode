package Functions;

class area {
    public static void main (String[]args) {
        String s;
        s =" A man, a plan, a canal: Panama";
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Java Regex - Regular expression
        int n = s.length() ;
        System.out.println(checkPalindrome(str,0));
    }

    public static boolean checkPalindrome(String s, int i){
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        return checkPalindrome(s,i+1);

    }
}