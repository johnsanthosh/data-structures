package com.exj.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	public static void levelOrderTraversal(BinarySearchTree root) {
		Queue<BinarySearchTree> queue = new LinkedList<BinarySearchTree>();
		BinarySearchTree node = root;
		queue.add(node);
		
		System.out.println("Level order traversal of the tree : ");
		
		while(!queue.isEmpty()) {
			node = queue.remove();
			System.out.print(node.data + " ");
			
			if(node.left != null) {
				queue.add(node.left);
			}
			
			if(node.right != null) {
				queue.add(node.right);
			}

		}
		
	}
	
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree(4);
		tree.insert(2);
		tree.insert(3);
		tree.insert(1);
		tree.insert(7);
		tree.insert(6);
		tree.insert(8);
		
		levelOrderTraversal(tree);
	}
}
