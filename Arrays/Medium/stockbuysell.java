package Arrays.Medium;

public class stockbuysell {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int maxSum = maxProfit(arr);
        System.out.println("The maximum profit is: " + maxSum);

    }
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i =1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            if((prices[i]-buy)>profit){
                profit = prices[i]-buy;
            }
        }
        return profit;
    }
}
