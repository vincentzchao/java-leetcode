package com.binchaos.leetcode.hard.p2035;

/**
 * [2035. Partition Array Into Two Arrays to Minimize Sum
 * Difference](https://leetcode.cn/problems/partition-array-into-two-arrays-to-minimize-sum-difference/description/)
 * todo
 *
 * @author Vincent
 */
public class P2035Solution {
	public int minimumDifference(int[] nums) {
		if (nums == null) {
			throw new IllegalArgumentException("数组对象不能为 null");
		}

		if (nums.length % 2 != 0) {
			throw new IllegalArgumentException("数组长度不能为奇数");
		}

		if (nums.length == 0) {
			return 0;
		}

		return getMinimumDifference(nums);
	}

	private int getMinimumDifference(int[] nums) {
		// 计算所有元素的和
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}

		int min = 0;
		for (int i = 1; i < nums.length; i++) {
			int sum1 = nums[0];

			// 计算两个数组 分别所有元素求和 后的差 的绝对值
			int abs = Math.abs(sum - sum1 - sum1);
			if (min > abs) {
				min = abs;
			}
		}
		return min;
	}
}
