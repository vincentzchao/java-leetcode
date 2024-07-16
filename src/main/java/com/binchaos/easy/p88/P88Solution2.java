package com.binchaos.easy.p88;

/**
 * [88. Merge Sorted Array](https://leetcode.cn/problems/merge-sorted-array/description)
 *
 * 此方法需要复制 nums1 数组，但代码可读性更好
 *
 * @author Vincent
 */
public class P88Solution2 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		// 如果 nums2 无数据，则可以直接返回 nums1
		if (n == 0) {
			return;
		}

		// 复制 nums1 ，nums1 的所有值将无效，会被重新赋值
		int[] nums1Copy = new int[nums1.length];
		for (int i = 0; i < nums1.length; i++) {
			nums1Copy[i] = nums1[i];
		}

		int p1 = 0;
		int p2 = 0;

		for (int i = 0; i < (m + n); i++) {
			// 如果 nums1Copy 已经遍历完，则遍历 nums2
			if (p1 == m) {
				nums1[i] = nums2[p2];
				p2++;
				continue;
			}

			// 如果 nums2 已经遍历完，则遍历 nums1Copy
			if (p2 == n) {
				nums1[i] = nums1Copy[p1];
				p1++;
				continue;
			}

			if (nums1Copy[p1] < nums2[p2]) {
				nums1[i] = nums1Copy[p1];
				p1++;
			} else {
				nums1[i] = nums2[p2];
				p2++;
			}
		}
	}
}
