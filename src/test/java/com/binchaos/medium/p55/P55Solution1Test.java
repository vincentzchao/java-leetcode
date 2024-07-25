package com.binchaos.medium.p55;

import org.junit.Test;

/**
 * @author Vincent
 */
public class P55Solution1Test {
	private final P55Solution1 solution = new P55Solution1();

	@Test
	public void case1() {
		solution.test("[2,3,1,1,4]", true);
	}

	@Test
	public void case2() {
		solution.test("[3,2,1,0,4]", false);
	}

	@Test
	public void case3() {
		solution.test("[2,0]", true);
	}

	@Test
	public void case4() {
		solution.test(
				"[2,0,6,9,8,4,5,0,8,9,1,2,9,6,8,8,0,6,3,1,2,2,1,2,6,5,3,1,2,2,6,4,2,4,3,0,0,0,3,8,2,4,0,1,2,0,1,4,6,5,8,0,7,9,3,4,6,6,5,8,9,3,4,3,7,0,4,9,0,9,8,4,3,0,7,7,1,9,1,9,4,9,0,1,9,5,7,7,1,5,8,2,8,2,6,8,2,2,7,5,1,7,9,6]",
				true);
	}

}
