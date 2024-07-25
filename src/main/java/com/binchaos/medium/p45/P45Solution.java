package com.binchaos.medium.p45;

import com.binchaos.common.array.ArrayUtils;
import org.junit.Assert;

/**
 * [45. Jump Game II](https://leetcode.cn/problems/jump-game-ii/description)
 * todo
 *
 * @author Vincent
 */
public abstract class P45Solution {
	public abstract int jump(int[] nums);

	public void test(String intSeq, int expected) {
		int jump = this.jump(ArrayUtils.intSeq2Array(intSeq));
		Assert.assertEquals(expected, jump);
	}
}
