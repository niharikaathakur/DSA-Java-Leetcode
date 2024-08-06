class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        if(len<=8){
            return len;
        }
        else if (len<=16){
            return 8 + (len-8)*2;
        }
        else if(len<=24){
            return 24 + (len-16)*3;
        }
        else if(len<=26){
            return 48 + (len-24)*4;
        }
        return -1;
    }
}