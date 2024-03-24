package LinearSearch;

public class SearchinString {
    public static void main(String[] args){
        String name = "Niharika";
        char target = 'u';
        //System.out.println(search(name,target));
        System.out.println(search2(name,target));
    }

    static boolean search2(String s,char target){
        if(s.isEmpty()){
            return false;
        }
        for(char ch: s.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
    static boolean search(String s,char target){
        if(s.isEmpty()){
            return false;
        }
        for(int i =0;i<s.length();i++){
            if(target == s.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
