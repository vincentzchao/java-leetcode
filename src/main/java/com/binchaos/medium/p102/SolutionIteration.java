package com.binchaos.medium.p102;

import com.binchaos.common.tag.TagBinaryTree;
import com.binchaos.common.tag.TagQueue;
import com.binchaos.common.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * [102. Binary Tree Level Order Traversal](https://leetcode.cn/problems/binary-tree-level-order-traversal/description/)
 *
 * 迭代
 *
 * @author Vincent
 */
@TagBinaryTree
@TagQueue
public class SolutionIteration {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> resultList = new ArrayList<>();
		if (root == null) {
			return resultList;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			int size = queue.size();

			// 某一层的节点值
			List<Integer> levelValList = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				assert node != null;
				levelValList.add(node.val);

				if (node.left != null) {
					queue.offer(node.left);
				}

				if (node.right != null) {
					queue.offer(node.right);
				}
			}

			// 这里没必要判断 levelValList 是否为空
			// 因为如果为空，即表示队列为空，但是如果队列为空，就不会进入最外层的 while 循环
			resultList.add(levelValList);
		}

		return resultList;
	}

}
