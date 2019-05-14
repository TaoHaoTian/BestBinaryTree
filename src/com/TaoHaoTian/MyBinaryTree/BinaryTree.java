package com.TaoHaoTian.MyBinaryTree;
/**
 * �������ӿ�
 * �����в�ͬ��ʵ���࣬ÿ�������ʹ�ò�ͬ�Ĵ洢�ṹ������˵˳��ṹ����ʽ�ṹ
 * @author lenovo
 *
 */
public interface BinaryTree {
	/**
	 * �Ƿ�Ϊ��
	 * @return
	 */
	public boolean isEmpty();
	/**
	 * ���������
	 * @return
	 */
	public int size();
	/**
	 * ��ȡ���ĸ߶�
	 * @return
	 */
	public int getHeight();
	/**
	 * ��ѯָ��ֵ�Ľ��
	 * @param value
	 * @return
	 */
	public Node findKey(int value);
	/**
	 * ǰ��ݹ����
	 */
	public void preOrderTraverse();
	/**
	 * ����ݹ����
	 */
	public void inOrderTraverse();
	/**
	 * ����ݹ����
	 */
	public void postOrderTraverse();
	/**
	 * ��������ݹ����
	 * @param node �����
	 */
	//Illegal modifier for the interface method postOrderTraverse; only public 
	// & abstract are permitted
	public void postOrderTraverse(Node node);
	/**
	 * ǰ������ǵݹ����
	 * 1������������current,���ý�㲻Ϊ������ʸý���ٽ����ѹ��ջ�����������������Ϊcurrent,
	 * 2����������Ϊ�գ�ջ������ջ���ý�����������Ϊcurrent
	 * 3���ظ�1��2������ֱ��currentΪ�ղ���ջ�ڵĽ��Ϊ��
	 */
	public void preOrderByStack();
	/**
	 * ��������ǵݹ����
	 * 1������������current���ý�㲻Ϊ���򽫸ý��ѹջ��������������Ϊcurrent���ظ��˲�����ֱ��currentΪ��
	 * 2����������Ϊ�գ�ջ������ջ�����ʽ���ý�����������Ϊcurrent
	 * 3���ظ�1��2������ֱ��currentΪ�ղ���ջ�ڽ��Ϊ��
	 */
	public void inOrderByStack();
	/**
	 * ��������ǵݹ�
	 * 1������������current���ý�㲻Ϊ������ʸý���ٽ����ѹջ�����������������Ϊcurrent���ظ��˲�����
	 * 2����������Ϊ�գ�ȡջ�����������������������Ϊ�ջ����������ձ����ʹ�������ʸý�㣬����preNode��Ϊ��
	 * 3���ظ�1��2������ֱ��currentΪ�ղ���ջ�ڽ��Ϊ��
	 */
	public void postOrderByStack();
	/**
	 * ���ղ�α���������
	 */
	public void levelOrderByStack();
}
