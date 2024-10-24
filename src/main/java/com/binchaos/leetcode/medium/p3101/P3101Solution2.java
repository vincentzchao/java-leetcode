package com.binchaos.leetcode.medium.p3101;

/**
 * [3101. Count Alternating Subarrays](https://leetcode.cn/problems/count-alternating-subarrays/description/)
 * 子数组：是数组中连续的 非空 元素序列。
 *
 * @author Vincent
 */
public class P3101Solution2 {
	/**
	 * 通过分析易知：
	 * 1、如果一个数组本身就是自己的 subarray alternating (交替子数组)，那么它的所有子数组都是 subarray alternating (交替子数组)
	 * 2、一个数组交替子数组，就是自己 所有分段最大交替子数组 的交替子数组数量的和。
	 *
	 * 分段最大交替子数组 是我自创的概念 (可能命名不太准确，姑且这么叫吧)：
	 * 即: 将数组分成若干段，每一段数组本身都是 自己的 交替子数组
	 * [0,1,0,1,1,0,1,0,1,1,1,1,0]
	 * 以上数组的 分段最大交替子数组 从左到右有: [0,1,0,1] [1,0,1,0,1] [1] [1] [1,0]
	 *
	 * @param nums
	 * @return
	 */
	public long countAlternatingSubarrays(int[] nums) {
		if (nums == null) {
			throw new IllegalArgumentException("数组对象为 null");
		}

		if (nums.length == 0) {
			return 0;
		}

		// 分段最大交替子数组的长度
		int length = 1;

		// 交替子数组 的 数量
		long count = 1;

		for (int i = 1; i < nums.length; i++) {
			// 是否和上一个元素一致
			if (nums[i] == nums[i - 1]) {
				// 重新计算 分段最大交替子数组的长度
				length = 1;
			} else {
				length++;
			}

			// 通过分析易知：
			// 如果 分段最大交替子数组 的当前长度为 length
			// 那么相较于 长度为 length - 1 的 分段最大交替子数组，它的子数组新增了 length 个
			// 可以这么想：
			// 这个新增的元素自己独立为一个子数组 + 它可以向前和相邻的 1个 、2个…… length - 1 个元素组成子数组，
			// 所以加起来是 length 个，也就是每新增一个元素，分段最大交替子数组 的 子数组 将会新增与当前 分段最大交替子数组 的长度相等的数量
			count += length;
		}

		return count;
	}
}
