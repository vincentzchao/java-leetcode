package com.binchaos.leetcode.medium.p3;

import org.junit.Assert;

/**
 * [3. Longest Substring Without Repeating
 * Characters](https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/)
 *
 * @author Vincent
 */
public abstract class P3Solution {
	public abstract int lengthOfLongestSubstring(String s);

	public void test(String input, int expected) {
		Assert.assertEquals(expected, lengthOfLongestSubstring(input));
	}
}
