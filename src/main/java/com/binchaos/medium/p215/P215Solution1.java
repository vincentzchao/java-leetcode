package com.binchaos.medium.p215;

import com.binchaos.common.tag.TagHeap;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 使用 Java 的 PriorityQueue
 *
 * @author Vincent
 */
@TagHeap
public class P215Solution1 extends P215Solution {
	@Override
	public int findKthLargest(int[] nums, int k) {
		Queue<Integer> minHeap = new PriorityQueue<>(k);

		// 将 前 k 个元素构建成小顶堆
		for (int i = 0; i < k; i++) {
			minHeap.offer(nums[i]);
		}

		// 遍历剩下的元素，与对顶的元素进行比较；
		// 如果大于堆顶元素，则移除堆顶元素，并将新元素加入堆
		for (int i = k; i < nums.length; i++) {
			if (minHeap.peek() < nums[i]) {
				minHeap.poll();
				minHeap.offer(nums[i]);
			}
		}

		return minHeap.peek();
	}
}
