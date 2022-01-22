package ru.job4j.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {
    @Test
    public void testOne() {
        MaxProfit maxProfit = new MaxProfit();
        int[] d = new int[]{7, 1, 5, 3, 6, 4};
        assertEquals(5, maxProfit.maxProfit(d));
    }
}