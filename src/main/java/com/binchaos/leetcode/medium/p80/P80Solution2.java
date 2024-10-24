package com.binchaos.leetcode.medium.p80;

/**
 * [80. Remove Duplicates from Sorted Array
 * II](https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii/description)
 *
 * @author Vincent
 */
public class P80Solution2 {
	public int removeDuplicates(int[] nums) {
		if (nums == null) {
			throw new IllegalArgumentException("数组不能为 null");
		}

		int length = nums.length;
		if (length <= 2) {
			return length;
		}

		// 此方案的整体思路是：把当前数组当成一个空白数组，每一个位子都待赋值；
		// 如果相同元素不超过两个，就赋原值；如果超过两个，就赋后面的值
		// 方案：
		// 使用 慢指针 表示当前需要被赋值的索引(最终也是此问题需要返回的 k 值，即最终剩下的元素个数)
		// 使用 快指针 表示当前被遍历到的元素
		// 使用快指针遍历整个数组，被遍历到的元素需要判断：是否与当前已处理得到的数组的 slow - 2 索引下的元素相等
		// 相等则表示这个元素需要被去掉，不能保留；否则，需要被追加到当前已处理的数组的最后。

		int slow = 2;
		int fast = 2;

		while (fast < length) {
			if (nums[slow - 2] != nums[fast]) {
				nums[slow] = nums[fast];
				slow++;
			}

			fast++;
		}

		return slow;
	}
}
