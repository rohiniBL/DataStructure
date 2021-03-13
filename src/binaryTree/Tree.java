package binaryTree;

class Node {    
    int value; 
   Node left,right; 
          
        Node(int value){ 
            this.value = value; 
            left = null; 
            right = null; 
        } 
    } 

public class Tree {
		       
		    public void insert(Node node, int value) {
		        if (value < node.value) {
		        	if (node.left != null) {
		        		insert(node.left, value); 
		        		} 
		        	else {
		        		System.out.println(" Inserted " + value + " to left of " + node.value); 
		        		node.left = new Node(value); 
		        		}
		        	} 
		        ///right side tree
		        else if (value > node.value) {
		          if (node.right != null) {
		            insert(node.right, value);
		          } else {
		            System.out.println("  Inserted " + value + " to right of "+ node.value);
		            node.right = new Node(value);
		          }
		        }
		      }
		    
		    // Get minimum element in binary search tree
			 public static Node minimumElement(Node root) {
			 if (root.left == null)
			 return root;
			 else {
			 return minimumElement(root.left);
			 }
			 }
			 
			 
			 
		
			 boolean iterativeSearch(Node root, int value) 
			 { 
			     // Traverse until root reaches to end 
			     while (root != null) { 
			         // pass right subtree as new tree 
			         if (value > root.value) 
			             root = root.right; 
			   
			         // pass left subtree as new tree 
			         else if (value < root.value) 
			             root = root.left; 
			         else
			             return true; 
			     } 
			     return false; 
			 } 
		    
		    
		    public static Node deleteNode(Node root, int value) {
				 if (root == null)
				 return null;
				 if (root.value > value) {
				 root.left = deleteNode(root.left, value);
				 } else if (root.value < value) {
				 root.right = deleteNode(root.right, value);
				 
				 } else {
				 // if nodeToBeDeleted have both children
				 if (root.left != null && root.right != null) {
				 Node temp = root;
				 // Finding minimum element from right
				 Node  minNodeForRight = minimumElement(temp.right);
				 // Replacing current node with minimum node from right subtree
				 root.value = minNodeForRight.value;
				 // Deleting minimum node from right now
				 root.right = deleteNode(root.right, minNodeForRight.value);
				 
				 }
				 // if nodeToBeDeleted has only left child
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
		    
		    //
		     public void traverseInOrder(Node node) {
		        if (node != null) {
		            traverseInOrder(node.left);
		            System.out.print(" " + node.value);
		            traverseInOrder(node.right);
		        }
		     }
		     
		     //In Pre-order traversal you visit the root node first, then the left subtree, and finally the right subtree. Here’s the code.
		     public void traversePreOrder(Node node) {
		    	    if (node != null) {
		    	        System.out.print(" " + node.value);
		    	        traversePreOrder(node.left);
		    	        traversePreOrder(node.right);
		    	    }
		    	}
		     
		     //In Post-order traversal you visit left subtree first, then the right subtree, and the root node at the end. Here’s the code.
		     public void traversePostOrder(Node node) {
		    	    if (node != null) {
		    	        traversePostOrder(node.left);
		    	        traversePostOrder(node.right);
		    	        System.out.print(" " + node.value);
		    	    }
		    	}
		     
		     public static void main(String args[]) 
		    { 
		    Tree tree = new Tree();
		                Node root = new Node(5);
		                System.out.println("Binary Tree Example");
		                System.out.println("Building tree with root value " + root.value);
		                tree.insert(root, 2);
		                tree.insert(root, 4);
		                tree.insert(root, 8);
		                tree.insert(root, 6);
		                tree.insert(root, 7);
		                tree.insert(root, 3);
		                tree.insert(root, 9);
		                boolean result = tree.iterativeSearch(root,10);
		                System.out.println(result+"fff");
		          
		                System.out.println("Traversing tree in order");
		                Tree.deleteNode(root, 5);
		                tree.traverseInOrder(root);
		                
		              }

}
