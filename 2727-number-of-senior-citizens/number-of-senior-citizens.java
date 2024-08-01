class Solution {
    public int countSeniors(String[] details) {
        int seniorCount = 0;

        for(String pass: details){
            int age = Integer.parseInt(pass.substring(11,13));

            if(age>60){
                seniorCount++;
            }
        }
        return seniorCount;
    }
}