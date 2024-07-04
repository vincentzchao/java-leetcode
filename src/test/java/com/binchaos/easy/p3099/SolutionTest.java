package com.binchaos.easy.p3099;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Vincent
 */
public class SolutionTest {

	private final Solution solution = new Solution();

	@Test
	public void case1_case2() {
		Assert.assertEquals(9, solution.sumOfTheDigitsOfHarshadNumber(18));
		Assert.assertEquals(-1, solution.sumOfTheDigitsOfHarshadNumber(23));
	}
}
