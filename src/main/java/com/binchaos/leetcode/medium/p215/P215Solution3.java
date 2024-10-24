package com.binchaos.leetcode.medium.p215;

import com.binchaos.leetcode.common.tag.TagHeap;
import com.binchaos.leetcode.common.tag.TagOfficial;

/**
 * 修改官方题解 buildMaxHeap 方法中循环的起始索引位置：将 heapSize / 2 改为 heapSize / 2 - 1
 * heapSize / 2 - 1 才是第一个非叶节点，heapSize / 2 并不是
 * 另外，官方题解好像还有两个问题：
 * 1. 貌似使用小顶堆更好些？
 * 2. 开始时并不需要构建完整的小顶堆，只要有前 k 个就行。
 *
 * @author Vincent
 */
@TagHeap
@TagOfficial
public class P215Solution3 extends P215Solution {
	@Override
	public int findKthLargest(int[] nums, int k) {
		int heapSize = nums.length;
		buildMaxHeap(nums, heapSize);
		for (int i = nums.length - 1; i >= nums.length - k + 1; --i) {
			swap(nums, 0, i);
			--heapSize;
			maxHeapify(nums, 0, heapSize);
		}
		return nums[0];
	}

	public void buildMaxHeap(int[] a, int heapSize) {
		for (int i = heapSize / 2; i >= 0; --i) {
			maxHeapify(a, i, heapSize);
		}
	}

	public void maxHeapify(int[] a, int i, int heapSize) {
		int l = i * 2 + 1, r = i * 2 + 2, largest = i;
		if (l < heapSize && a[l] > a[largest]) {
			largest = l;
		}
		if (r < heapSize && a[r] > a[largest]) {
			largest = r;
		}
		if (largest != i) {
			swap(a, i, largest);
			maxHeapify(a, largest, heapSize);
		}
	}

	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
