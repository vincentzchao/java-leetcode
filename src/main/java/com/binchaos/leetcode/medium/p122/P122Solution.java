package com.binchaos.leetcode.medium.p122;

import com.binchaos.leetcode.common.array.ArrayUtils;
import org.junit.Assert;

/**
 * [122. Best Time to Buy and Sell Stock
 * II](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/description/)
 *
 * @author Vincent
 */
public abstract class P122Solution {
	public abstract int maxProfit(int[] prices);

	public void test(String intSeq, int expected) {
		Assert.assertEquals(expected, maxProfit(ArrayUtils.intSeq2Array(intSeq)));
	}
}
