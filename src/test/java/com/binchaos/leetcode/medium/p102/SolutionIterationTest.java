package com.binchaos.leetcode.medium.p102;

import com.binchaos.leetcode.common.tree.TreeNode;
import com.binchaos.leetcode.common.tree.TreeUtils;
import com.binchaos.leetcode.medium.p102.SolutionIteration;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author Vincent
 */
public class SolutionIterationTest {
	private final SolutionIteration solution = new SolutionIteration();

	@Test
	public void case1() {
		valid("[3,9,20,null,null,15,7]", "[[3],[9,20],[15,7]]");
	}

	@Test
	public void case2() {
		valid("[1]", "[[1]]");
	}

	@Test
	public void case3() {
		valid("[]", "[]");
	}

	private void valid(String valSeq, String expectedOutput) {
		TreeNode binaryTree = TreeUtils.createBinaryTree(valSeq);

		List<List<Integer>> result = solution.levelOrder(binaryTree);

		Assert.assertEquals(expectedOutput, result.toString().replace(" ", ""));
	}
}
