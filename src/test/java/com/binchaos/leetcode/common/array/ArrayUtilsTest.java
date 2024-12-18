package com.binchaos.leetcode.common.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Vincent
 */
public class ArrayUtilsTest {
	@Test
	public void array2Seq_test1() {
		String expected = "[1,2,3,5]";
		int[] intArray = new int[] { 1, 2, 3, 5 };

		Assert.assertEquals(expected, ArrayUtils.array2Seq(intArray));
	}

	@Test
	public void array2Seq_test2() {
		String expected = "[]";
		int[] intArray = new int[] {};

		Assert.assertEquals(expected, ArrayUtils.array2Seq(intArray));
	}

	@Test
	public void intSeq2Array_test1() {
		String expected = "[1,2,3,5]";
		int[] intArray = ArrayUtils.intSeq2Array(expected);

		Assert.assertEquals(expected, ArrayUtils.array2Seq(intArray));
	}

	@Test
	public void intSeq2Array_test2() {
		String expected = "[]";
		int[] intArray = ArrayUtils.intSeq2Array(expected);

		Assert.assertEquals(expected, ArrayUtils.array2Seq(intArray));
	}
}
