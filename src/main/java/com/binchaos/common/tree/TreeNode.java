package com.binchaos.common.tree;

/**
 * Tree 的 node
 * 代码来自 LeetCode 官方
 *
 * @author Vincent
 */
public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}