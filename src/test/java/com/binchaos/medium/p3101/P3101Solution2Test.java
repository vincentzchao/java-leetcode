package com.binchaos.medium.p3101;

import com.binchaos.common.InputUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Vincent
 */
public class P3101Solution2Test {
	private final P3101Solution2 solution = new P3101Solution2();

	@Test
	public void countAlternatingSubarrays_case1() {
		verify("[0,1,1,1]", 5);
	}

	@Test
	public void countAlternatingSubarrays_case2() {
		verify("[1,0,1,0]", 10);
	}

	@Test
	public void countAlternatingSubarrays_empty_array() {
		verify("[]", 0);
	}

	@Test
	public void countAlternatingSubarrays_one_ele() {
		verify("[1]", 1);
	}

	private void verify(String input, int expected) {
		int[] nums = InputUtils.intSeq2Array(input);
		Assert.assertEquals(expected, solution.countAlternatingSubarrays(nums));
	}

}
