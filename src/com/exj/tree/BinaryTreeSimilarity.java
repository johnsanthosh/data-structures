package com.exj.tree;

public class BinaryTreeSimilarity {
	
	public static boolean isSameTree(BinarySearchTree p, BinarySearchTree q) {
        if(p == null && q == null){
            return true;
        }else if((p == null && q != null) || (p != null && q == null)){
            return false;
        }
        
        if(p.data == q.data){
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }else{
            return false;
        }
    }
	
	public static void main(String[] args) {
		BinarySearchTree tree1 = new BinarySearchTree(4);
		tree1.insert(2);
		tree1.insert(3);
		tree1.insert(1);
		tree1.insert(7);
		tree1.insert(6);
		tree1.insert(8);
		
		BinarySearchTree tree2 = new BinarySearchTree(4);
		tree2.insert(2);
		tree2.insert(3);
		tree2.insert(1);
		tree2.insert(7);
		tree2.insert(6);
		tree2.insert(8);
		
		boolean similar = isSameTree(tree1, tree2);
		
		if(similar) {
			System.out.println("The trees are similar.");
		}else {
			System.out.println("The trees are not similar.");
		}
		
	}
}
