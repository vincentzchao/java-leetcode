package com.binchaos.leetcode.common.tree;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Vincent
 */
public class TreeUtilsTest {

	@Test
	public void toString_3nodes() {
		// =================   0
		// =================  /
		// ================= 1
		// =================  \
		// =================   2
		String valSeq = "[0,1,null,null,2]";

		TreeNode rootNode = new TreeNode(0);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);

		rootNode.left = node1;
		node1.right = node2;

		Assert.assertEquals(valSeq, TreeUtils.toString(rootNode));
	}

	@Test
	public void toString_7nodes() {
		// =================      0
		// =================     / \
		// =================    1   2
		// =================       / \
		// =================      3   4
		// =================     / \
		// =================    5   6
		String valSeq = "[0,1,2,null,null,3,4,5,6]";

		TreeNode rootNode = new TreeNode(0);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);

		rootNode.left = node1;
		rootNode.right = node2;

		node2.left = node3;
		node2.right = node4;

		node3.left = node5;
		node3.right = node6;

		Assert.assertEquals(valSeq, TreeUtils.toString(rootNode));
	}

	@Test
	public void createBinaryTree_3nodes() {
		// =================   0
		// =================  /
		// ================= 1
		// =================  \
		// =================   2
		String valSeq = "[0,1,null,null,2]";

		TreeNode binaryTree = TreeUtils.createBinaryTree(valSeq);
		Assert.assertEquals(valSeq, TreeUtils.toString(binaryTree));
	}

	@Test
	public void createBinaryTree_7nodes() {
		// =================      0
		// =================     / \
		// =================    1   2
		// =================       / \
		// =================      3   4
		// =================     / \
		// =================    5   6
		String valSeq = "[0,1,2,null,null,3,4,5,6]";

		TreeNode binaryTree = TreeUtils.createBinaryTree(valSeq);
		Assert.assertEquals(valSeq, TreeUtils.toString(binaryTree));
	}
}
