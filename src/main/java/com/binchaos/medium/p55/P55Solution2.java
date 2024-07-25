package com.binchaos.medium.p55;

import com.binchaos.common.tag.TagArray;

/**
 * 官方题解
 *
 * @author Vincent
 */
@TagArray
public class P55Solution2 extends P55Solution {
	@Override
	public boolean canJump(int[] nums) {
		if ((nums == null) || (nums.length == 0)) {
			throw new IllegalArgumentException("数组不能为空");
		}

		return doCanJump(nums);
	}

	private boolean doCanJump(int[] nums) {
		// 遍历每一个元素，记录此元素可以到达的最远位置
		// 对于每一个位置 i ，如果它在当前可以到达的 最远位置 内，则表示此位置可以到达
		// 则计算它可以到达的最远位置，同时更新当前可以到达的最远位置

		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i <= max) {
				max = Math.max(i + nums[i], max);
				// 如果可到达的最远距离大于最后一个位置，则返回 true
				if (max >= nums.length - 1) {
					return true;
				}
			} else {
				// (易知，如果数组可以到达最后一个元素，则表明数组的每个元素都可以到达)
				// 如果当前位置 i，无法到达，则说明此数组无法到达最后一个元素
				return false;
			}
		}

		return false;
	}

}
