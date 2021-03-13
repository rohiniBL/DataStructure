package bst.com;

public class Main {
	
	public static void main(String[] args) {
		Tree tree =new Tree();
		Node root =new Node(5);
		tree.insert(root, 4);
		tree.insert(root, 3);
		tree.insert(root, 6);
		tree.insert(root, 7);
	    System.out.println(root.value+"Root Value");
	    tree.traversalInOrder(root);
	    System.out.println("PreOrder===========");
	    tree.traversalPreOrder(root);
	    System.out.println("Delete");
	    tree.deleteNode(root,5 );
	    tree.traversalInOrder(root);
	    
	}

}
