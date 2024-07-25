package com.binchaos.medium.p55;

import com.binchaos.common.tag.TagArray;
import com.binchaos.common.tag.TagRecursion;

/**
 * 此题解采用递归的方式，时间复杂度太高
 *
 * @author Vincent
 */
@Deprecated
@TagArray
@TagRecursion
public class P55Solution1 extends P55Solution {
	@Override
	public boolean canJump(int[] nums) {
		if ((nums == null) || (nums.length == 0)) {
			throw new IllegalArgumentException("数组不能为空");
		}

		return doCanJump(nums, nums.length - 1);
	}

	private boolean doCanJump(int[] nums, int index) {
		if (index == 0) {
			return true;
		}

		for (int i = index - 1; i >= 0; i--) {
			// 如果当前元素可以从 i 处到达，则进行递归，看 i 处是否能到达
			if (index - i <= nums[i]) {
				// 如果 i 能到达，则表示 index 可以到达
				if (doCanJump(nums, i)) {
					return true;
				}
			}
		}

		return false;
	}

}
