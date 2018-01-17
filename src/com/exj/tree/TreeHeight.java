package com.exj.tree;

public class TreeHeight {
	
	public static int height(BinarySearchTree root) {
		if(root == null) {
			return 0;
		}
		return (Math.max(height(root.left), height(root.left)) + 1);
	}
	
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree(4);
		tree.insert(2);
		tree.insert(3);
		tree.insert(1);
		tree.insert(7);
		tree.insert(6);
		tree.insert(8);
		
		System.out.println("Height of the tree is : "+height(tree));
	}
}
