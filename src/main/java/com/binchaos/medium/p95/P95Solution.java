package com.binchaos.medium.p95;

import com.binchaos.common.tag.TagBinaryTree;
import com.binchaos.common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * [95. Unique Binary Search Trees II](https://leetcode.cn/problems/unique-binary-search-trees-ii/description/)
 *
 * @author Vincent
 */
@TagBinaryTree
public class P95Solution {
	public List<TreeNode> generateTrees(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("n 必须为正数");
		}

		return buildChildTrees(1, n);
	}

	private List<TreeNode> buildChildTrees(int min, int max) {
		List<TreeNode> list = new ArrayList<>();
		// 如果 min > max 说明这棵子树是没有节点的，那就是 null
		if (min > max) {
			list.add(null);
			return list;
		}

		// 如果 min == max 说明这棵子树只有一个节点，那也就只有一种排列方式
		if (min == max) {
			list.add(new TreeNode(min));
			return list;
		}

		// 选择一个根节点，有 (max - min + 1) 种方案
		// 一旦选择了根节点，那么左子树种包含的节点、右子树种包含的节点就都确定了，只不过左子树和右子树都分别都有不同的多种排列结构。
		for (int i = min; i <= max; i++) {
			// 构建所有可能的左子树
			List<TreeNode> leftChildTree = buildChildTrees(min, i - 1);

			// 构建所有可能的右子树
			List<TreeNode> rightChildTree = buildChildTrees(i + 1, max);

			// 遍历所有左子树和右子树，添加到 root 节点下
			for (TreeNode leftChild : leftChildTree) {
				for (TreeNode rightChild : rightChildTree) {
					TreeNode root = new TreeNode(i);
					root.left = leftChild;
					root.right = rightChild;
					list.add(root);
				}
			}
		}

		return list;
	}
}
