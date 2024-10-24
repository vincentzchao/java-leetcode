package com.binchaos.leetcode.easy.p88;

import com.binchaos.leetcode.common.array.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Vincent
 */
public class P88SolutionTest2 {
	private final P88Solution2 solution = new P88Solution2();

	@Test
	public void case1() {
		test("[1,2,3,0,0,0]", 3, "[2,5,6]", 3, "[1,2,2,3,5,6]");
	}

	@Test
	public void case2() {
		test("[1]", 1, "[]", 0, "[1]");
	}

	@Test
	public void case3() {
		test("[0]", 0, "[1]", 1, "[1]");
	}

	@Test
	public void case4() {
		test("[2,0]", 1, "[1]", 1, "[1,2]");
	}

	@Test
	public void case5() {
		test("[4,5,6,0,0,0]", 3, "[1,2,3]", 3, "[1,2,3,4,5,6]");
	}

	private void test(String intSeq1, int m, String intSeq2, int n, String expected) {
		int[] nums1 = ArrayUtils.intSeq2Array(intSeq1);
		int[] nums2 = ArrayUtils.intSeq2Array(intSeq2);

		solution.merge(nums1, m, nums2, n);
		Assert.assertEquals(expected, ArrayUtils.array2Seq(nums1));
	}
}
