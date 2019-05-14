package com.TaoHaoTian.MyBinaryTree;

public class Node {
	Object value;//结点值
	Node leftChild;//左子树的引用
	Node rightChild;//右子树的引用
	public Node(Object value) {
		this.value=value;
	}
	public Node(Object value,Node leftChild,Node rightChild) {
		this.value=value;
		this.leftChild=leftChild;
		this.rightChild=rightChild;
	}
	//1:This static method cannot hide the 
	//instance method from Object
	//2:public  static String t0oString()
	public String toString() {
		return "Node [value="+value+",leftChild="
	    +leftChild+",rightChild="+rightChild+"]";
	}
}
