package com.binchaos.leetcode.medium.p3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vincent
 */
public class P3Solution1 extends P3Solution {
	@Override
	public int lengthOfLongestSubstring(String s) {
		if ("".equals(s)) {
			return 0;
		}

		int low = 0;
		int high = 0;

		// 存放已经出现的字符
		Map<Character, Integer> seq = new HashMap<>();

		int longest = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (seq.containsKey(ch)) {
				longest = Math.max(longest, high - low + 1);

				Integer index = seq.get(ch);

				// 移除 low 到 index 的所有字符
				for (int j = low; j <= index; j++) {
					seq.remove(s.charAt(j));
				}

				low = index + 1;
			}

			high = i;
			seq.put(ch, i);
		}

		// 比较下最后的滑动窗口的大小
		return Math.max(longest, high - low + 1);
	}
}
