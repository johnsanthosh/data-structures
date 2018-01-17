package com.exj.tree;

public class BinarySearchTree {
	BinarySearchTree left, right;
	int data;
	
	public BinarySearchTree(int data) {
		this.data = data;
	}
	
	public void insert(int data){
    	if(data < this.data){
    		if(left == null){
    			left = new BinarySearchTree(data);
    		}else{
    			left.insert(data);
    		}
    	}else{
    		if(right == null){
    			right = new BinarySearchTree(data);
    		}else{
    			right.insert(data);
    		}
    	}
    }
    
    public void inOrderTraversal(){
    	if(left != null){
    		left.inOrderTraversal();
    	}
    	
       System.out.print(data + " ");
       
       if(right != null){
    	   right.inOrderTraversal();
       }
    }
    
    public boolean find(int data){
    	if(this.data == data){
    		return true;
    	}
    	
    	if(data < this.data){
    		if(left == null){
    			return false;
    		}else{
    			return left.find(data);
    		}
    	}else{
    		if(right == null){
    			return false;
    		}else{
    			return right.find(data);
    		}
    	}
    }
    
    public BinarySearchTree delete(BinarySearchTree root, int data) {
    	if(root == null) {
    		return root;
    	}else if(data< root.data) {
    		root.left = delete(root.left, data);
    	}else if(data >root.data) {
    		root.right = delete(root.right, data);
    	}else if(data == root.data) {
    		
    		if(root.left == null) {
    			return root.right;
    		}else if(root.right == null) {
    			return root.left;
    		}else {
    			root.data = min(root.right);
    			root.right = delete(root.right, root.data);
    		}
    		
    	}
    	
    	return root;
    }
    
    public int min(BinarySearchTree root) {
		int val = root.data;
    	while(root.left != null) {
    		val = root.left.data;
    		root = root.left;
    	}
    	return val;
	}
    
    public static void main(String[] args) {
    	BinarySearchTree tree = new BinarySearchTree(4);
		tree.insert(2);
		tree.insert(3);
		tree.insert(1);
		tree.insert(7);
		tree.insert(6);
		tree.insert(8);
		
		tree.delete(tree, 7);
		tree.inOrderTraversal();
	}
}
