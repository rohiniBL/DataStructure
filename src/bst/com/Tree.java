package bst.com;

import binaryTree.BinarySearch.TreeNode;

public class Tree {
	
	public void insert(Node node,int value) {
		
		if(value < node.value) {
			if(node.left !=null) {
				insert(node.left,value);
			}else {
				System.out.println("Inserted"+value+"to left of"+node.value);
				node.left=new Node(value);
			}
		}
		if(value > node.value) {
			if(node.right !=null) {
				insert(node.right,value);
			}else {
				System.out.println("Inserted"+value+"to right of"+node.value);
				node.right=new Node(value);
			}
		}
		
	}
	
	 public static Node minimumElement(Node root) {
		 if (root.left == null)
		 return root;
		 else {
		 return minimumElement(root.left);
		 }
		 }
	
	
	public Node deleteNode(Node root,int value) {
		if(root == null) {
			return null;
		}
		if(root.value > value) {
			root.left=deleteNode(root.left,value);
		}else if(root.value < value) {
			root.right=deleteNode(root.right,value);
		}else {
			if(root.left !=null && root.right !=null) {
				Node node=root;
				Node minRight = minimumElement(node.right);
				root.value=minRight.value;
				root.right=deleteNode(root.right, minRight.value);
				
			} // if nodeToBeDeleted has only left child
			 else if (root.left != null) {
				 root = root.left;
				 }
				 // if nodeToBeDeleted has only right child
				 else if (root.right != null) {
				 root = root.right;
				 }
				 // if nodeToBeDeleted do not have child (Leaf node)
				 else
				 root = null;
				 }
				 return root;
	
	}
	
	
	public void traversalInOrder(Node node) {
		if(node !=null) {
			traversalInOrder(node.left);
		System.out.println(""+node.value);
		traversalInOrder(node.right);
		}
	}
	
	public void traversalPreOrder(Node node) {
		if(node !=null) {
		System.out.println(""+node.value);
		traversalInOrder(node.left);
		traversalInOrder(node.right);
		}
	}
	
	public void traversalPostOrder(Node node) {
		if(node !=null) {
		traversalInOrder(node.left);
		traversalInOrder(node.right);
		System.out.println(""+node.value);
		}
	}

}
