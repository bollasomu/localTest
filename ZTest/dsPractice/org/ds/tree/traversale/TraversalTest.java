package org.ds.tree.traversale;

import org.ds.tree.Node;

public class TraversalTest {


	public void inOrderTravesal(Node bTree) {

		if(bTree==null) {
			return;
		}
		inOrderTravesal(bTree.left);
		System.out.print(bTree.data + ", ");
		inOrderTravesal(bTree.right);
	}

	public void preOrderTravesal(Node bTree) {

		if(bTree==null) {
			return;
		}
		System.out.print(bTree.data + ", ");
		preOrderTravesal(bTree.left);
		preOrderTravesal(bTree.right);
	}

	public void postOrderTravesal(Node bTree) {

		if(bTree==null) {
			return;
		}
		
		postOrderTravesal(bTree.left);
		postOrderTravesal(bTree.right);
		System.out.print(bTree.data + ", ");
		
	}
	public static void main(String[] args) {

		TraversalTest b = new TraversalTest();
		Node root = b.insertNode(10);
		root.left = b.insertNode(20);
		root.right = b.insertNode(30);

		root.left.left = b.insertNode(40);
		root.left.right = b.insertNode(50);

		root.right.left = b.insertNode(60);
		root.right.right = b.insertNode(70);

		//System.out.println(root);

		System.out.println("In Order Traversal : ");
		b.inOrderTravesal(root);
		
		System.out.println();
		System.out.println("Pre Order Traversal : ");
		b.preOrderTravesal(root);
		
		System.out.println();
		System.out.println("Post Order Traversal : ");
		b.postOrderTravesal(root);
	}

	public Node insertNode(int data) {

		Node node = new Node();
		node.data = data;
		node.left = null;
		node.right = null;
		return node;
	}

}
