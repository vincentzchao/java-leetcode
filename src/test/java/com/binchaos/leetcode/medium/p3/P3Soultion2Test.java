package com.binchaos.leetcode.medium.p3;

import org.junit.Test;

/**
 * @author Vincent
 */
public class P3Soultion2Test {
	private final P3Solution2 solution = new P3Solution2();

	@Test
	public void case1() {
		solution.test("abcabcbb", 3);
	}

	@Test
	public void case2() {
		solution.test("bbbbb", 1);
	}

	@Test
	public void case3() {
		solution.test("pwwkew", 3);
	}

	@Test
	public void case4() {
		solution.test(" ", 1);
	}

	@Test
	public void case5() {
		solution.test("", 0);
	}

	@Test
	public void case6() {
		solution.test("abba", 2);
	}

	@Test
	public void case7() {
		solution.test("abbb", 2);
	}
}
