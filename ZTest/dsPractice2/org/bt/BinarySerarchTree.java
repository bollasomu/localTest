package org.bt;

public class BinarySerarchTree {

	public Node createdNode(int data) {

		Node node = new Node();
		node.data = data;
		node.left = null;
		node.right = null;

		return node;
	}

	public Node inserBST(Node node, int data) {
		if (node == null) {
			return createdNode(data);
		}

		if (data < node.data) {
			
			node.left = inserBST(node.left, data);
			
		} else if (data > node.data) {
			
			node.right = inserBST(node.right, data);
		}
		return node;
	}
	
	public static void main(String[] args) {
		
		BinarySerarchTree bst = new BinarySerarchTree();
		
		Node root = null;
		
		root = bst.inserBST(root, 10);
		root = bst.inserBST(root, 9);
		root = bst.inserBST(root, 11);
		root = bst.inserBST(root, 8);
		root = bst.inserBST(root, 12);
		root = bst.inserBST(root, 7);
		root = bst.inserBST(root, 13);
		root = bst.inserBST(root, 6);
		root = bst.inserBST(root, 14);
		
		System.out.println("BST : " + root);
	
	}
}
