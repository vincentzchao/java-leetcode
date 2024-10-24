package com.binchaos.leetcode.easy.p3099;

/**
 * [3099. Harshad Number](https://leetcode.cn/problems/harshad-number/description)
 *
 * @author Vincent
 */
public class Solution {
	public int sumOfTheDigitsOfHarshadNumber(int x) {
		int y = x;
		int sum = 0;
		while (y != 0) {
			sum += y % 10;
			y = y / 10;
		}

		if (x % sum == 0) {
			return sum;
		}

		return -1;
	}
}