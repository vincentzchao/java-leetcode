package com.binchaos.leetcode.medium.p80;

/**
 * [80. Remove Duplicates from Sorted Array
 * II](https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii/description)
 *
 * 此解题思路过于复杂，且中间有多次元素移位的操作，不应采纳此方法
 *
 * @author Vincent
 */
@Deprecated
public class P80Solution {
	public int removeDuplicates(int[] nums) {
		if (nums == null) {
			throw new IllegalArgumentException("数组不能为 null");
		}

		if (nums.length == 0) {
			return 0;
		}

		int count = 1;
		int k = nums.length;

		int i = 1;
		while (i < k) {
			if (nums[i] == nums[i - 1]) {
				count++;
			}

			// 如果遍历到了下一个不同的元素，或者 整个数组已经遍历到了最后一个元素，则进行 count 的处理
			if ((nums[i] != nums[i - 1]) || (i == k - 1)) {
				if (count > 2) {
					// 如果相同元素超过两个，则后续元素向前移动 delta 个
					int delta = count - 2;

					// 减掉多出的重复元素
					k -= delta;

					for (int j = i - delta; j < k; j++) {
						nums[j] = nums[j + delta];
					}

					// 回到上一个重复元素的下一个元素
					i = i - delta;
				}

				count = 1;
			}

			i++;
		}

		return k;
	}
}
