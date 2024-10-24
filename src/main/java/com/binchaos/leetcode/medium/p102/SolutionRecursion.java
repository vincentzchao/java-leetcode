package com.binchaos.leetcode.medium.p102;

import com.binchaos.leetcode.common.tag.TagBinaryTree;
import com.binchaos.leetcode.common.tag.TagRecursion;
import com.binchaos.leetcode.common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * [102. Binary Tree Level Order Traversal](https://leetcode.cn/problems/binary-tree-level-order-traversal/description/)
 *
 * 递归调用
 *
 * @author Vincent
 */
@TagBinaryTree
@TagRecursion
public class SolutionRecursion {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> resultList = new ArrayList<>();

		List<TreeNode> nodes = new ArrayList<>();
		nodes.add(root);

		levelOrder(resultList, nodes);
		return resultList;
	}

	public void levelOrder(List<List<Integer>> resultList, List<TreeNode> nodes) {
		if (nodes.isEmpty()) {
			return;
		}

		// 遍历获取所有节点的值
		List<Integer> resultItem = new ArrayList<>();
		for (TreeNode node : nodes) {
			if (node == null) {
				continue;
			}

			resultItem.add(node.val);
		}

		// 如果某一层没有数据，则空数组不加入最终的结果
		if (!resultItem.isEmpty()) {
			resultList.add(resultItem);
		}

		// 获取下一层的节点
		List<TreeNode> subNodes = new ArrayList<>();
		for (TreeNode node : nodes) {
			if (node != null) {
				subNodes.add(node.left);
				subNodes.add(node.right);
			}
		}

		// 获取下一层的数据
		levelOrder(resultList, subNodes);
	}
}
