package com.binchaos.medium.p215;

import com.binchaos.common.array.ArrayUtils;
import org.junit.Assert;

/**
 * [215. Kth Largest Element in an Array](https://leetcode.cn/problems/kth-largest-element-in-an-array/description/)
 *
 * @author Vincent
 */
public abstract class P215Solution {
	public abstract int findKthLargest(int[] nums, int k);

	public void test(String intSeq, int k, int expectedNum) {
		int num = findKthLargest(ArrayUtils.intSeq2Array(intSeq), k);
		Assert.assertEquals(expectedNum, num);
	}
}
