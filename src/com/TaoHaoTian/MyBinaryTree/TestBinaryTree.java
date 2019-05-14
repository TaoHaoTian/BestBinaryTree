package com.TaoHaoTian.MyBinaryTree;

public class TestBinaryTree {
	public static void main(String[] args) {
		//创建二叉树
		Node node5=new Node(5,null,null);
		Node node4=new Node(4,null,node5);
		Node node3=new Node(3,null,null);//&
		Node node7=new Node(7,null,null);//
		Node node6=new Node(6,null,node7);
		Node node2=new Node(2,node3,node6);
		Node node1=new Node(1,node4,node2);
	
		BinaryTree btree=new LinkedBinaryTree(node1);
		//Treeset,分大小
		btree.preOrderTraverse();
		btree.inOrderTraverse();
		btree.postOrderTraverse();
		
		//中序遍历非递归（借助栈）
		btree.inOrderByStack();
		//层次遍历
		btree.levelOrderByStack();
		
		System.out.println(btree.getHeight());
		System.out.println(btree.size());
		System.out.println(btree.findKey(1));
	}
}
