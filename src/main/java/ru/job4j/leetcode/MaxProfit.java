package ru.job4j.leetcode;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int result = 0;
        if (prices.length == 0) {
            return result;
        }
        int bought = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > bought) {
                if (result < (prices[i] - bought)) {
                    result = prices[i] - bought;
                }
            } else {
                bought = prices[i];
            }
        }
        return result;
    }
}