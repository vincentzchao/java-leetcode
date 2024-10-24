package com.binchaos.leetcode.medium.p3;

import org.junit.Test;

/**
 * @author Vincent
 */
public class P3Soultion1Test {
	private final P3Solution1 solution = new P3Solution1();

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

}
