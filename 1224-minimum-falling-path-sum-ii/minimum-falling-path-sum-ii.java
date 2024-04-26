class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n=grid.length;
        int dp[][] = new int[n][n];
        for(int i=0; i<n; i++){
            dp[0][i]=grid[0][i];
        }
        for(int i=1; i<n; i++){
            int[] prev_min = new int[n];
            int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (dp[i-1][j] < first || (dp[i-1][j] == first && dp[i-1][j] != second)) {
                    second = first;
                    first = dp[i-1][j];
                }
                else if (dp[i-1][j] < second && dp[i-1][j] != first){
                    second = dp[i-1][j];
                }
            }
            for(int j=0; j<n; j++){
                if(dp[i-1][j]==first){
                    prev_min[j]=second;
                }else{
                    prev_min[j]=first;
                }
            }
            for(int j=0; j<n; j++){
                dp[i][j]=prev_min[j]+grid[i][j];
            }
        }
        int ans = dp[n-1][0];
        for(int i=1; i<n; i++){
            ans=Math.min(dp[n-1][i],ans);
        }
        return ans;
    }
}