package com.TaoHaoTian.MyBinaryTree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedBinaryTree implements BinaryTree{
	
	private Node root;
	//private int size;//������
	public LinkedBinaryTree() {
		
	}
	public LinkedBinaryTree(Node root) {
		this.root=root;
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	public int size() {
		System.out.println("���������ĸ���:");
		return this.size(root);
	}
	private int size(Node root) {
		if(root==null) {
			return 0;
		}else {
			return this.size(root.leftChild)+this.size(root.rightChild)+1;
		}
	}
	public int getHeight() {
		System.out.println("�������ĸ߶�:");
		return this.getHeight(root);
	}
	private int getHeight(Node root) {
		if(root==null) {
			return 0;
		}else{
			int m=this.getHeight(root.leftChild);
			int n=this.getHeight(root.rightChild);
			return m>n?m+1:n+1;
		}
	}
	public Node findKey(int value) {
		return this.findKey(value, root);
	}
	public Node findKey(Object value,Node root) {
		if(root==null) {
			return null;
		}else if(root!=null&&root.value==value) {
			return root;
		}else {
			Node node1=this.findKey(value, root.leftChild);
			Node node2=this.findKey(value,root.rightChild);
			if(node1!=null&&node1.value==value) {
				return node1;
			}else if(node2!=null&&node2.value==value){
				return node2;
			}else {
				return null;
			}
			
		}
	}
	public void preOrderTraverse() {
		System.out.println("�������:");
		this.preOrderTraverse(root);
		System.out.println();
	}
	/**
	private void preOrderTraverse(Node root) {
		if(root!=null) {
			//���������ֵ
			System.out.print(root.value+" ");
			//���������������
			//����һ���������������������ĸ�
			BinaryTree leftTree=new LinkedBinaryTree(root.leftChild);
			leftTree.preOrderTraverse();
			//���������������
			//����һ���������������������ĸ�
			BinaryTree rightTree=new LinkedBinaryTree(root.rightChild);
			rightTree.preOrderTraverse();
		}
	}
	*/
	private void preOrderTraverse(Node root) {
		if(root!=null) {
			System.out.print(root.value+" ");
			this.preOrderTraverse(root.leftChild);
			this.preOrderTraverse(root.rightChild);
		}
		
	}
	
	public void inOrderTraverse() {
		System.out.println("�������:");
		this.inOrderTraverse(root);
		System.out.println();
	}
	
	private void inOrderTraverse(Node root) {
		if(root!=null) {
			this.inOrderTraverse(root.leftChild);
			System.out.print(root.value+" ");
			this.inOrderTraverse(root.rightChild);
		}
	
	}

	public void postOrderTraverse() {
		System.out.println("�������:");
		this.postOrderTraverse(root);
		System.out.println();
	}

	public void postOrderTraverse(Node root) {
		if(root!=null) {
			this.postOrderTraverse(root.leftChild);
			this.postOrderTraverse(root.rightChild);
			System.out.print(root.value+" ");
		}
	}
	
	public void preOrderByStack() {
		
	}
	
	public void inOrderByStack() {
		System.out.println("����ǵݹ����:");
		//����ջ,Dequeʵ����LinkedList,ArrayDeque
		Deque<Node>stack=new LinkedList<Node>();
		Node current =root;
		while(current!=null||!stack.isEmpty()) {
			while(current!=null) {
				stack.push(current);
				current=current.leftChild;
			}
			if(!stack.isEmpty()) {
				current=stack.pop();
				System.out.print(current.value+" ");
				current=current.rightChild;
			}
		}
		System.out.println();
	}
	
	public void postOrderByStack() {
		
	}

	public void levelOrderByStack() {
		System.out.println("���ղ�α���������:");
		if(root==null)return;
		//���У��������
		Queue<Node>queue=new LinkedList<Node>();//����
		queue.add(root);
			while(queue.size()!=0) {
				int len=queue.size();
				for(int i=0;i<len;i++) {
					Node temp=queue.poll();//����
					System.out.print(temp.value+" ");//�����֮ǰ
					if(temp.leftChild!=null)queue.add(temp.leftChild);
					if(temp.rightChild!=null)queue.add(temp.rightChild);
				}
			}
			System.out.println();
	}//12����
}
