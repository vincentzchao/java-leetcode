package com.binchaos.leetcode.common.tree;

/**
 * TreeNode
 * 属性和构造方法来自 LeetCode 官方
 *
 * @author Vincent
 */
public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode() {
	}

	public TreeNode(int val) {
		this.val = val;
	}

	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	/**
	 * 用于打印结果
	 *
	 * @return
	 */
	@Override
	public String toString() {
		return TreeUtils.toString(this);
	}
}