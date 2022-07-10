package piyali.dsa.leetcode.best_time_buy_sell_stock_121;

public class BestTimeBuySellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if ((price - minPrice) > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
