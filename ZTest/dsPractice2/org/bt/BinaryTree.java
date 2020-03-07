package org.bt;



public class BinaryTree {

	
	private Node createNode(int data) {
		Node node = new Node();
		node.data = data;
		node.left = null;
		node.right = null;
		
		return node;
	}
	
	public Node binaryTree(int data) {
		
		return createNode(data);
	}
	
	
	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		Node root = bt.binaryTree(10);
		root.left = bt.binaryTree(11);
		root.right = bt.binaryTree(12);
		
		
		root.left.left = bt.binaryTree(13);
		root.left.right = bt.binaryTree(14);
		
		root.right.left = bt.binaryTree(15);
		root.right.right = bt.binaryTree(16);
		
		System.out.println(root);
		
		
	}
}
