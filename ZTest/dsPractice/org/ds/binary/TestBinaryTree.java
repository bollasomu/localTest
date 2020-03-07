package org.ds.binary;

import java.util.LinkedList;
import java.util.Queue;

public class TestBinaryTree {

	
	// Level order traversal
	static void printLevelOrder(Node root)  
    { 
        Queue<Node> queue = new LinkedList<Node>(); 
        queue.add(root); 
        while (!queue.isEmpty())  
        { 
            Node tempNode = queue.poll(); 
            System.out.print(tempNode.data + " "); 
  
       
            if (tempNode.left != null) { 
                queue.add(tempNode.left); 
            } 
  
           
            if (tempNode.right != null) { 
                queue.add(tempNode.right); 
            } 
        } 
    } 
  
	public static void main(String[] args) {
		
		
		BinaryTree bt = new BinaryTree(); //5 -> 6 -> 7.
		
		Node tree = bt.createNode(1);
		tree.left = bt.createNode(2);
		tree.right = bt.createNode(3);
		
		tree.left.left = bt.createNode(4);
		tree.left.right = bt.createNode(5);
		
		tree.right.left = bt.createNode(6);
		tree.right.right = bt.createNode(7);
		
		System.out.println(tree);
		
		System.out.println("Level Order tree traversal ");
		printLevelOrder(tree);
		
		
	}
}
