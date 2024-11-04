package com.binchaos.leetcode.easy.p28;

import org.junit.Test;

/**
 * @author Vincent
 */
public class P28Solution1Test {
	private final P28Solution1 solution = new P28Solution1();

	@Test
	public void case1() {
		solution.test("sadbutsad", "sad", 0);
	}

	@Test
	public void case2() {
		solution.test("leetcode", "leeto", -1);
	}

	@Test
	public void case3() {
		solution.test("a", "a", 0);
	}
}
