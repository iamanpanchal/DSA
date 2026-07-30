class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int max_profit = 0;
        int buy_prices = prices[0];

        for(int i = 1; i < n; i++) {

            int current_profit = prices[i] - buy_prices;
            if(current_profit > max_profit) {
                max_profit = current_profit;
            }
            if(buy_prices > prices[i]){
                buy_prices = prices[i];
            }
        }

        return max_profit;
    }
}

// class Solution {
//     public int maxProfit(int[] prices) {

//         int minPrice = prices[0];
//         int maxProfit = 0;

//         for(int i = 1; i < prices.length; i++) {

//             if(prices[i] < minPrice) {
//                 minPrice = prices[i];
//             }
//             else {
//                 maxProfit = Math.max(maxProfit, prices[i] - minPrice);
//             }
//         }

//         return maxProfit;
//     }
// }

// class Solution {
//     public int maxProfit(int[] prices) {

//         int profit = 0;

//         for(int i = 0; i < prices.length; i++) {
//             for(int j = i + 1; j < prices.length; j++) {
//                 profit = Math.max(profit, prices[j] - prices[i]);
//             }
//         }

//         return profit;
//     }
// }