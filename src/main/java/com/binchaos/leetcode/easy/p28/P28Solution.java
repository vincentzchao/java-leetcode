package com.binchaos.leetcode.easy.p28;

import org.junit.Assert;

/**
 * [28. Find the Index of the First Occurrence in a String]
 * (https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string/description/)
 *
 * @author Vincent
 */
public abstract class P28Solution {
	public abstract int strStr(String haystack, String needle);

	public void test(String haystack, String needle, int expected) {
		Assert.assertEquals(expected, strStr(haystack, needle));
	}
}
