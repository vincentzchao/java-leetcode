package com.binchaos.medium.p3101;

/**
 * [3101. Count Alternating Subarrays](https://leetcode.cn/problems/count-alternating-subarrays/description/)
 * 子数组：是数组中连续的 非空 元素序列。
 *
 * @author Vincent
 */
public class P3101Solution {
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

		// 交替子数组 的 数量
		long count = 0;

		// 分段最大交替子数组的长度
		int length = 1;

		for (int i = 1; i < nums.length; i++) {
			// 是否和上一个元素一致
			if (nums[i] == nums[i - 1]) {
				count += countFromAlternatingSubarrays(length);
				// 重新计算 分段最大交替子数组的长度
				length = 1;
			} else {
				length++;
			}
		}

		// 计算最后一个 分段最大交替子数组 的 交替子数组 的 数量
		count += countFromAlternatingSubarrays(length);

		return count;
	}

	/**
	 * 计算 [本身是自己的 subarray alternating (交替子数组) ] 的 数组 的 [交替子数组] 的 数量
	 *
	 * 如：
	 * [0,1,0,1]
	 * 1个元素有 4 种
	 * 2个元素有 3 种
	 * 3个元素有 2 种
	 * 4个元素有 1 种
	 * 总数：(4 + 1) * 4 / 2 = 10
	 *
	 * @param n
	 * @return
	 */
	private long countFromAlternatingSubarrays(int n) {
		if (n == 0) {
			return 0;
		}
		return (long) (n + 1) * n / 2;
	}
}
