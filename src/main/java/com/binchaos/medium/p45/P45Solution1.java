package com.binchaos.medium.p45;

/**
 * @author Vincent
 */
public class P45Solution1 extends P45Solution {
	@Override
	public int jump(int[] nums) {
		if ((nums == null) || (nums.length == 0)) {
			throw new IllegalArgumentException("数组不能为空");
		}

		return doJump(nums, nums.length);
	}

	private int doJump(int[] nums, int minJump) {

		return 0;
	}
}
