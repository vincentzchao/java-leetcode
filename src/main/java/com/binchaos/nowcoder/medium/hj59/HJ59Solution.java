package com.binchaos.nowcoder.medium.hj59;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * [HJ59 找出字符串中第一个只出现一次的字符](https://www.nowcoder.com/practice/e896d0f82f1246a3aa7b232ce38029d4)
 *
 * @author Vincent
 */
public class HJ59Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();

		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			map.compute(ch, (key, value) -> {
				if (value == null) {
					return 1;
				} else {
					return value + 1;
				}
			});
		}
		boolean flag = false;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				flag = true;
				System.out.println(entry.getKey());
				break;
			}
		}

		if (!flag) {
			System.out.println(-1);
		}

	}
}
