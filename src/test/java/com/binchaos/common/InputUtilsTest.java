package com.binchaos.common;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Vincent
 */
public class InputUtilsTest {
	@Test
	public void array2Seq_test1() {
		String expected = "[1,2,3,5]";
		int[] intArray = new int[] { 1, 2, 3, 5 };

		Assert.assertEquals(expected, InputUtils.array2Seq(intArray));
	}

	@Test
	public void array2Seq_test2() {
		String expected = "[]";
		int[] intArray = new int[] {};

		Assert.assertEquals(expected, InputUtils.array2Seq(intArray));
	}

	@Test
	public void intSeq2Array_test1() {
		String expected = "[1,2,3,5]";
		int[] intArray = InputUtils.intSeq2Array(expected);

		Assert.assertEquals(expected, InputUtils.array2Seq(intArray));
	}

	@Test
	public void intSeq2Array_test2() {
		String expected = "[]";
		int[] intArray = InputUtils.intSeq2Array(expected);

		Assert.assertEquals(expected, InputUtils.array2Seq(intArray));
	}
}
