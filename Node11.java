package Tree;

public class Node11 {
int item;
int key;
Node11 left, right;

public Node11(int key) {
	item = key;
	left = right = null;
}
}

class BinaryTree{
	Node11 root;
	
	BinaryTree(int key){
		root = new Node11(key);
	}
	
	BinaryTree(){
		root = null;
	}
	
	
	public void traversepostorder(Node11 node) {
		if(node != null)
			return;
		//Traverse left
		traversepostorder(node.left);
		System.out.println(" " + node.key);
		//Traverse right
		traversepostorder(node.right);
		//Traverse root
		System.out.println(node.item + "->");
	}
	
	public void traverseinorder(Node11 node) {
		if(node != null) {
			return;}
		//Traverse left
		traverseinorder(node.right);
		traverseinorder(node.left);
		//Traverse root
		System.out.print(" " + node.key);
	
	}
	
	public void traversepreorder(Node11 node) {
		if (node != null) {
			return;}
		//Traverse root
		System.out.print(" " + node.key);
		//Traverse left
		traversepreorder(node.left);
		//Traverse right
		traversepreorder(node.right);
	
	}

	public static void main(String[]args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node11(1);
		tree.root.left = new Node11(2);
		tree.root.right = new Node11(3);
		tree.root.left.left = new Node11(4);
		tree.root.left.right = new Node11(5);
		
		System.out.println("Inorder traversal");
		tree.traverseinorder(tree.root);
		
		System.out.println("\nPreorder traversal ");
		tree.traversepreorder(tree.root);
		
		System.out.println("\nPostorder traversal ");
		tree.traversepostorder(tree.root);
	}
}

