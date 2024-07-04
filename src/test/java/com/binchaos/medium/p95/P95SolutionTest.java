package com.binchaos.medium.p95;

import com.binchaos.common.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author Vincent
 */
public class P95SolutionTest {
	private final P95Solution solution = new P95Solution();

	@Test
	public void case1() {
		valid(3, "[[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]");
	}

	@Test
	public void case2() {
		valid(1, "[[1]]");
	}

	private void valid(int n, String expected) {
		List<TreeNode> list = solution.generateTrees(n);
		Assert.assertEquals(expected, list.toString().replace(" ", ""));
	}
}
