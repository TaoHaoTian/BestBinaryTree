package com.TaoHaoTian.MyBinaryTree;
/**
 * 二叉树接口
 * 可以有不同的实现类，每个类可以使用不同的存储结构，比如说顺序结构，链式结构
 * @author lenovo
 *
 */
public interface BinaryTree {
	/**
	 * 是否为空
	 * @return
	 */
	public boolean isEmpty();
	/**
	 * 树结点数量
	 * @return
	 */
	public int size();
	/**
	 * 获取树的高度
	 * @return
	 */
	public int getHeight();
	/**
	 * 查询指定值的结点
	 * @param value
	 * @return
	 */
	public Node findKey(int value);
	/**
	 * 前序递归遍历
	 */
	public void preOrderTraverse();
	/**
	 * 中序递归遍历
	 */
	public void inOrderTraverse();
	/**
	 * 后序递归遍历
	 */
	public void postOrderTraverse();
	/**
	 * 后序遍历递归操作
	 * @param node 树结点
	 */
	//Illegal modifier for the interface method postOrderTraverse; only public 
	// & abstract are permitted
	public void postOrderTraverse(Node node);
	/**
	 * 前序遍历非递归操作
	 * 1）对于任意结点current,若该结点不为空则访问该结点再将结点压入栈，并将左子树结点置为current,
	 * 2）若左子树为空，栈顶结点出栈，该结点的右子树置为current
	 * 3）重复1，2操作，直到current为空并且栈内的结点为空
	 */
	public void preOrderByStack();
	/**
	 * 中序遍历非递归操作
	 * 1）对于任意结点current若该结点不为空则将该结点压栈，并将左子树置为current，重复此操作，直到current为空
	 * 2）若左子树为空，栈顶结点出栈，访问结点后该结点的右子树置为current
	 * 3）重复1，2操作，直到current为空并且栈内结点为空
	 */
	public void inOrderByStack();
	/**
	 * 后序遍历非递归
	 * 1）对于任意结点current若该结点不为空则访问该结点再将结点压栈，并将左子树结点置为current，重复此操作，
	 * 2）若左子树为空，取栈顶结点的右子树，如果有字数为空或者右子树刚被访问过，则访问该结点，并将preNode置为该
	 * 3）重复1，2操作，直到current为空并且栈内结点为空
	 */
	public void postOrderByStack();
	/**
	 * 按照层次遍历二叉树
	 */
	public void levelOrderByStack();
}
