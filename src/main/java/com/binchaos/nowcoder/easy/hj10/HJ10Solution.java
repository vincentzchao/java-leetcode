package com.binchaos.nowcoder.easy.hj10;

import java.util.Scanner;

/**
 * [HJ10 字符个数统计](https://www.nowcoder.com/practice/eb94f6a5b2ba49c6ac72d40b5ce95f50)
 *
 * @author Vincent
 */
public class HJ10Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();

		int[] count = new int[128];
		int num = 0;
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			if (count[ch] == 0) {
				num++;
			}
			count[ch]++;
		}

		System.out.println(num);
	}
}
