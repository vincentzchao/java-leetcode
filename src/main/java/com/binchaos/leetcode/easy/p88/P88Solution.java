package com.binchaos.leetcode.easy.p88;

/**
 * [88. Merge Sorted Array](https://leetcode.cn/problems/merge-sorted-array/description)
 *
 * 此方法不需要额外新增一个数组，但代码较复杂一些
 *
 * @author Vincent
 */
public class P88Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		// 如果 nums2 无数据，则可以直接返回 nums1
		if (n == 0) {
			return;
		}

		// 最终 merge 后的结果存在 nums1 中，所以以 nums1 为基础，进行合并
		// 遍历 nums1
		for (int i = 0; i < m; i++) {
			// 如果 nums2 的第一个元素，小于当前 nums1 中遍历到的元素
			// 则需要将当前 nums2 的第一个元素 放置到当前 nums1 中遍历到的元素的位子
			// 而 当前 nums1 中遍历到的元素，则需要按升序，放置到 nums2 中
			if (nums2[0] < nums1[i]) {
				int temp = nums1[i];
				nums1[i] = nums2[0];

				// 防止 n == 1 时 下面的循环不执行，导致 temp 丢失
				nums2[0] = temp;

				// 按升序，将 nums1 中的元素插入到 nums2 中
				for (int j = 1; j < n; j++) {
					if (temp > nums2[j]) {
						nums2[j - 1] = nums2[j];
						// 如果是最后一个元素，则表示当前 nums1 中的元素 比 nums2 所有元素都大，需要赋值给最后一个元素
						if (j == n - 1) {
							nums2[j] = temp;
						}
					} else {
						nums2[j - 1] = temp;
						break;
					}
				}
			}
		}

		// 最终 nums 中还剩下 n 个元素，直接接到 nums1 末尾即可
		for (int i = 0; i < n; i++) {
			nums1[m + i] = nums2[i];
		}
	}
}
