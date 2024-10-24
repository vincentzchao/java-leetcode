package com.binchaos.leetcode.medium.p55;

import com.binchaos.leetcode.common.array.ArrayUtils;
import org.junit.Assert;

/**
 * [55. Jump Game](https://leetcode.cn/problems/jump-game/description)
 *
 * @author Vincent
 */
public abstract class P55Solution {
	public abstract boolean canJump(int[] nums);

	public void test(String intSeq, boolean expected) {
		int[] nums = ArrayUtils.intSeq2Array(intSeq);
		Assert.assertEquals(expected, this.canJump(nums));
	}
}
