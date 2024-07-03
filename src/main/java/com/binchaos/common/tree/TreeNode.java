package com.binchaos.common.tree;

/**
 * Tree 的 node
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

	// ====================================== toString

	@Override
	public String toString() {
		return TreeUtils.toString(this);
	}

	// ====================================== static methods

}