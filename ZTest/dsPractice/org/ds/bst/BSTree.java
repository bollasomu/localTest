package org.ds.bst;

import org.ds.tree.Node;

public class BSTree {

	
	public Node createNode(int data) {
		
		Node node = new Node();
		node.data = data;
		node.left = null;
		node.right = null;
		
		return node;
	}
	
	public Node insertNodeBst(Node node, int data) {
		
		if(node==null) {
			return createNode(data);
		}
		
		if(data < node.data) {
			node.left = insertNodeBst(node.left,data);
		} else if(data > node.data) {
			node.right = insertNodeBst(node.right, data);
		}
		
		return node;
		
	}
	public static void main(String[] args) {
		
		BSTree bstTree = new BSTree();
		
		Node root = null;
		root = bstTree.insertNodeBst(root, 10);
		root = bstTree.insertNodeBst(root, 8);
		root = bstTree.insertNodeBst(root, 11);
		
		root = bstTree.insertNodeBst(root, 9);
		
	}
}
