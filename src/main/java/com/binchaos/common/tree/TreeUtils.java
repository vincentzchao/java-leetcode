package com.binchaos.common.tree;

import com.binchaos.common.InputUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 树相关工具类
 *
 * @author Vincent
 */
public class TreeUtils {
	private static final String SPACE_STR = " ";

	private TreeUtils() {
		// 无参构造
	}

	public static String toString(TreeNode root) {
		return toString(toStringOrder(root));
	}

	public static String toString(List<Integer> resultList) {
		// 去掉空格
		return resultList.toString().replace(SPACE_STR, "");
	}

	// ====================================================================================
	// ================ 遍历
	// ====================================================================================

	public static List<Integer> toStringOrder(TreeNode root) {
		List<Integer> resultList = new ArrayList<>();
		if (root == null) {
			return resultList;
		}

		Queue<TreeNode> valQueue = new LinkedList<>();
		valQueue.offer(root);

		// 根据 leetcode 用例区的规则，末尾的 null 是没有必要
		// 但是，这里没有办法在遍历中判断 null 值是否是末尾的null
		// 因为，我们只有遍历到最后一层的最后一个元素，才能知道，null 值是否要留下
		while (!valQueue.isEmpty()) {
			int size = valQueue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = valQueue.poll();

				if (node != null) {
					resultList.add(node.val);

					valQueue.offer(node.left);
					valQueue.offer(node.right);
				} else {
					resultList.add(null);
				}
			}
		}

		// 移除末尾的 null
		while (resultList.get(resultList.size() - 1) == null) {
			resultList.remove(resultList.size() - 1);
		}

		return resultList;
	}

	// ====================================================================================
	// ================ 生成二叉树
	// ====================================================================================

	public static TreeNode createBinaryTree(String intValSeq) {
		List<Integer> intValList = InputUtils.intSeq2List(intValSeq);
		return createBinaryTree(intValList);
	}

	/**
	 * 根据层序遍历的值生成二叉树 (用 null 填充缺失的值，以提供足够的信息，可以还原出二叉树)
	 *
	 * 可以在 leetcode 官网题库的右下角测试用例区验证
	 * 如 [3,9,20,null,null,15,7]
	 * *    3
	 * *   / \
	 * *  9   20
	 * *     /  \
	 * *    15   7
	 *
	 * 如 []
	 * 则表示 root 指向 null，即树为空
	 *
	 * 如 [3,9,20,null,null,15,7,22,44]
	 * (可知，如果上一层已有叶子节点，则此叶子节点的子节点的子节点，下一层不需要用 null 填充)
	 * *    3
	 * *   / \
	 * *  9   20
	 * *     / \
	 * *   15   7
	 * *  / \
	 * * 22 44
	 *
	 * @param levelOrderValList 层序遍历的各个节点值的列表
	 * @return
	 */
	public static TreeNode createBinaryTree(List<Integer> levelOrderValList) {
		if ((levelOrderValList == null) || (levelOrderValList.isEmpty())) {
			return null;
		}

		// 如果第一个值就是 null，则直接返回 null
		TreeNode rootNode = createTreeNode(levelOrderValList, 0);
		if (rootNode == null) {
			return null;
		}

		Queue<TreeNode> valQueue = new LinkedList<>();
		valQueue.offer(rootNode);

		int i = 0;
		while (!valQueue.isEmpty()) {
			// 叶子节点数据
			int leafNodeNum = valQueue.size();

			for (int j = 0; j < leafNodeNum; j++) {
				// 上一层的叶子节点
				TreeNode leafNode = valQueue.poll();
				assert leafNode != null;

				// 获取左右子节点，如果不是 null ，则加到队列中，供后续继续处理

				TreeNode leftSubNode = createTreeNode(levelOrderValList, ++i);
				leafNode.left = leftSubNode;
				if (leftSubNode != null) {
					valQueue.offer(leftSubNode);
				}

				TreeNode rightSubNode = createTreeNode(levelOrderValList, ++i);
				leafNode.right = rightSubNode;
				if (rightSubNode != null) {
					valQueue.offer(rightSubNode);
				}
			}
		}

		return rootNode;
	}

	private static TreeNode createTreeNode(List<Integer> levelOrderValList, int index) {
		if (index < 0) {
			throw new IllegalArgumentException("index 不能小于 0");
		}

		// 如果越界就给 null
		if (index >= levelOrderValList.size()) {
			return null;
		}

		return createTreeNode(levelOrderValList.get(index));
	}

	private static TreeNode createTreeNode(Integer val) {
		if (val == null) {
			return null;
		}

		return new TreeNode(val);
	}
}
