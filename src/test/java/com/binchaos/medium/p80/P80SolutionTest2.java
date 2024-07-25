package com.binchaos.medium.p80;

import com.binchaos.common.array.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Vincent
 */
public class P80SolutionTest2 {

	private final P80Solution2 solution = new P80Solution2();

	@Test
	public void case1() {
		test("[1,1,1,2,2,3]", "[1,1,2,2,3]");
	}

	@Test
	public void case2() {
		test("[0,0,1,1,1,1,2,3,3]", "[0,0,1,1,2,3,3]");
	}

	@Test
	public void case3() {
		test("[0,0,0,1,1,1,1]", "[0,0,1,1]");
	}

	@Test
	public void case4() {
		test("[-50,-50,-49,-48,-47,-47,-47,-46,-45,-43,-42,-41,-40,-40,-40,-40,-40,-40,-39,-38,-38,-38,-38,-37,-36,-35,-34,-34,-34,-33,-32,-31,-30,-28,-27,-26,-26,-26,-25,-25,-24,-24,-24,-22,-22,-21,-21,-21,-21,-21,-20,-19,-18,-18,-18,-17,-17,-17,-17,-17,-16,-16,-15,-14,-14,-14,-13,-13,-12,-12,-10,-10,-9,-8,-8,-7,-7,-6,-5,-4,-4,-4,-3,-1,1,2,2,3,4,5,6,6,7,8,8,9,9,10,10,10,11,11,12,12,13,13,13,14,14,14,15,16,17,17,18,20,21,22,22,22,23,23,25,26,28,29,29,29,30,31,31,32,33,34,34,34,36,36,37,37,38,38,38,39,40,40,40,41,42,42,43,43,44,44,45,45,45,46,47,47,47,47,48,49,49,49,50]",
				"[-50,-50,-49,-48,-47,-47,-46,-45,-43,-42,-41,-40,-40,-39,-38,-38,-37,-36,-35,-34,-34,-33,-32,-31,-30,-28,-27,-26,-26,-25,-25,-24,-24,-22,-22,-21,-21,-20,-19,-18,-18,-17,-17,-16,-16,-15,-14,-14,-13,-13,-12,-12,-10,-10,-9,-8,-8,-7,-7,-6,-5,-4,-4,-3,-1,1,2,2,3,4,5,6,6,7,8,8,9,9,10,10,11,11,12,12,13,13,14,14,15,16,17,17,18,20,21,22,22,23,23,25,26,28,29,29,30,31,31,32,33,34,34,36,36,37,37,38,38,39,40,40,41,42,42,43,43,44,44,45,45,46,47,47,48,49,49,50]");
	}

	private void test(String intSeq, String expectedIntSeq) {
		int[] expectedNums = ArrayUtils.intSeq2Array(expectedIntSeq);
		int[] nums = ArrayUtils.intSeq2Array(intSeq);

		int k = solution.removeDuplicates(nums);
		Assert.assertEquals(expectedNums.length, k);

		for (int i = 0; i < k; i++) {
			Assert.assertEquals(expectedNums[i], nums[i]);
		}
	}
}
