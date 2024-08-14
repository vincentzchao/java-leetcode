package com.binchaos.medium.p215;

import org.junit.Test;

/**
 * @author Vincent
 */
public class P215Solution1Test {
	private static final P215Solution1 solution = new P215Solution1();

	@Test
	public void case1() {
		solution.test("[3,2,1,5,6,4]", 2, 5);
	}

	@Test
	public void case2() {
		solution.test("[3,2,3,1,2,4,5,5,6]", 4, 4);
	}
}
