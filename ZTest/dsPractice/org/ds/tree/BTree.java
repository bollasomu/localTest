package org.ds.tree;

public class BTree {

	
	public Node insertNode(int data) {
		
		Node node = new Node();
		node.data = data;
		node.left = null;
		node.right = null;
		
		return node;
		
	}
	
	public static void main(String[] args) {
		
		BTree b = new BTree();
		
		Node root = b.insertNode(10);
		root.left = b.insertNode(20);
		root.right = b.insertNode(30);
		
		root.left.left = b.insertNode(40);
		root.left.right = b.insertNode(50);
		
		root.right.left = b.insertNode(60);
		root.right.right = b.insertNode(70);
		
		
		System.out.println(root);
		
		
		
		
		
		
	}
}
