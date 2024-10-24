package com.binchaos.leetcode.medium.p215;

import com.binchaos.leetcode.common.tag.TagHeap;

/**
 * 在原数组中实现堆
 *
 * @author Vincent
 */
@TagHeap
public class P215Solution2 extends P215Solution {
	@Override
	public int findKthLargest(int[] nums, int k) {
		// 对前 k 个元素创建小顶堆
		initialHeap(nums, k);

		//
		for (int i = k; i < nums.length; i++) {
			if (nums[0] < nums[i]) {
				swap(nums, 0, i);
				siftDown(nums, 0, k);
			}
		}

		return nums[0];
	}

	public void initialHeap(int[] nums, int k) {
		for (int i = 1; i < k; i++) {
			// 如果小于父亲节点的值，则需要与父亲节点交换
			siftUp(nums, i);
		}
	}

	public void siftUp(int[] nums, int i) {
		while (i > 0) {
			int parentIndex = parentIndex(i);
			if (nums[i] < nums[parentIndex]) {
				swap(nums, i, parentIndex);
				i = parentIndex;
			} else {
				break;
			}
		}
	}

	public void siftDown(int[] nums, int i, int k) {
		while (i < k) {
			int leftChildIndex = leftChildIndex(i);
			int rightChildIndex = rightChildIndex(i);

			if (leftChildIndex >= k) {
				// 如果 左孩子 大于等于 k，则说明当前 i 已经到了堆底
				break;
			} else if (rightChildIndex < k) {
				// 如果 右孩子 小于 k，则说明两个孩子节点都有效
				if ((nums[leftChildIndex] <= nums[rightChildIndex]) && (nums[i] > nums[leftChildIndex])) {
					swap(nums, i, leftChildIndex);
					i = leftChildIndex;
				} else if ((nums[leftChildIndex] > nums[rightChildIndex]) && (nums[i] > nums[rightChildIndex])) {
					swap(nums, i, rightChildIndex);
					i = rightChildIndex;
				} else {
					break;
				}
			} else {
				// 如果 leftChildIndex < k <= rightChildIndex，则说明只有左节点有效
				if (nums[i] > nums[leftChildIndex]) {
					swap(nums, i, leftChildIndex);
					i = leftChildIndex;
				} else {
					break;
				}
			}
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
