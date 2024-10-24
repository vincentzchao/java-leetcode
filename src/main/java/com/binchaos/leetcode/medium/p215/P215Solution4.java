package com.binchaos.leetcode.medium.p215;

import com.binchaos.leetcode.common.tag.TagHeap;

/**
 * 在原数组中实现堆
 * 1. 自顶向下初始化前 k 个元素作为初始小顶堆 (新元素加入堆中时，是从堆底部开始往上比较，如果新元素更小，则替换其父节点)。
 * 2. 遍历剩下的 nums.length - k 个元素，分别与小顶堆堆顶元素进行比较，如果比堆顶元素大，则与堆顶元素进行交换。
 * 3. 返回最终的堆顶元素。
 *
 * @author Vincent
 */
@TagHeap
public class P215Solution4 extends P215Solution {
	@Override
	public int findKthLargest(int[] nums, int k) {
		initialMinHeap(nums, k);

		for (int i = k; i < nums.length; i++) {
			if (nums[0] < nums[i]) {
				swap(nums, 0, i);
				siftDown(nums, 0, k);
			}
		}

		return nums[0];
	}

	public void initialMinHeap(int[] nums, int k) {
		for (int i = 1; i < k; i++) {
			// 如果小于父亲节点的值，则需要与父亲节点交换
			siftUp(nums, i);
		}
	}

	public void siftUp(int[] nums, int i) {
		int p = parentIndex(i);
		if (nums[i] < nums[p]) {
			swap(nums, i, p);
			siftUp(nums, p);
		}
	}

	public void siftDown(int[] a, int i, int k) {
		int l = leftChildIndex(i);
		int r = rightChildIndex(i);
		int min = i;

		if (l < k && a[l] < a[min]) {
			min = l;
		}

		if (r < k && a[r] < a[min]) {
			min = r;
		}

		if (min != i) {
			swap(a, i, min);
			siftDown(a, min, k);
		}
	}

	public void swap(int[] nums, int i1, int i2) {
		int tmp = nums[i1];
		nums[i1] = nums[i2];
		nums[i2] = tmp;
	}

	public int parentIndex(int i) {
		return (i - 1) / 2;
	}

	public int leftChildIndex(int i) {
		return 2 * i + 1;
	}

	public int rightChildIndex(int i) {
		return 2 * i + 2;
	}

}
