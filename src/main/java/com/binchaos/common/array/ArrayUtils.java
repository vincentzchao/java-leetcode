package com.binchaos.common.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 输入值的工具类
 *
 * @author Vincent
 */
public class ArrayUtils {
	private static final String EMPTY_SEQ = "[]";

	private static final String LEFT_BRACKET = "[";
	private static final String RIGHT_BRACKET = "]";
	private static final String EMPTY_STR = "";

	private static final String VAL_SEPARATOR = ",";
	private static final String NULL_STR = "null";

	private static final String SPACE_STR = " ";

	private ArrayUtils() {
		// 无参构造
	}

	/**
	 * Integer 值的 String 序列转 List
	 *
	 * @param intSeq
	 * @return
	 */
	public static List<Integer> intSeq2List(String intSeq) {
		if ((intSeq == null) || (intSeq.isEmpty())) {
			throw new IllegalArgumentException("值序列格式错误，格式应如：[3,9,20,null,null,15,7,22,44]");
		}

		// todo: 如下代码并不完美，没有考虑字符串中空格以外的空白字符的问题
		String cleanValSeq = intSeq.replace(SPACE_STR, EMPTY_STR).replace(LEFT_BRACKET, EMPTY_STR)
				.replace(RIGHT_BRACKET, EMPTY_STR);
		String[] valArr = cleanValSeq.split(VAL_SEPARATOR);

		// 如果只有一个字符串，且这个字符串为空，说明原始字符串为 []
		if ((valArr.length == 1) && (Objects.equals(valArr[0], EMPTY_STR))) {
			return new ArrayList<>();
		}

		List<Integer> intValList = new ArrayList<>();
		for (String val : valArr) {
			try {
				if (val.equals(NULL_STR)) {
					intValList.add(null);
				} else {
					Integer intVal = new Integer(val);
					intValList.add(intVal);
				}
			} catch (Exception e) {
				throw new IllegalArgumentException(String.format("[%s] 为非法值，值必须是整数", val));
			}
		}

		return intValList;
	}

	/**
	 * Integer 值的 String 序列转 Array
	 *
	 * @param intSeq
	 * @return
	 */
	public static int[] intSeq2Array(String intSeq) {
		List<Integer> intValList = intSeq2List(intSeq);
		int[] intValArray = new int[intValList.size()];
		for (int i = 0; i < intValList.size(); i++) {
			Integer intVal = intValList.get(i);
			if (intVal == null) {
				throw new IllegalArgumentException("输入的值序列中不能有 null 值");
			}
			intValArray[i] = intVal;
		}
		return intValArray;
	}

	/**
	 * 将数组转成值序列
	 *
	 * @param intArray
	 * @return
	 */
	public static String array2Seq(int[] intArray) {
		if (intArray == null) {
			throw new IllegalArgumentException("数组不能为 null");
		}

		if (intArray.length == 0) {
			return EMPTY_SEQ;
		}

		StringBuilder stringBuilder = new StringBuilder();
		for (int i : intArray) {
			stringBuilder.append(i).append(",");
		}

		return LEFT_BRACKET + stringBuilder.substring(0, stringBuilder.length() - 1) + RIGHT_BRACKET;
	}
}
