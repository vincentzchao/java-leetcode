package com.binchaos.nowcoder.easy.hj12;

import java.util.Scanner;

/**
 * [HJ12 字符串反转](https://www.nowcoder.com/practice/e45e078701ab4e4cb49393ae30f1bb04)
 *
 * @author Vincent
 */
public class HJ12Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		StringBuilder sb = new StringBuilder();
		for (int i = line.length() - 1; i >= 0; i--) {
			sb.append(line.charAt(i));
		}
		System.out.println(sb);
	}
}
