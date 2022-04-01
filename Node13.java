package Tree;

import Tree.PerfectBinaryTree.Node;

public class Node13 {
int data;
Node13 left, right;

Node13(int item){
	data = item;
	left = right = null;
}
}

class BinaryTree{
	Node13 root;
	
	//count the number of nodes
	int countNumNodes(Node root) {
		if(root == null)
			return(0);
		return (1 + countNumNodes(root.left) + countNumNodes(root.right));
	}
	
	//Check for complete binary tree
	boolean checkComplete(Node root, int index, int numberNodes) {
		
		//Check if the tree is empty
		if(root == null)
			return true;
		
		if(index >= numberNodes)
			return false;
		
		return (checkComplete(root.left, 2*index + 1, numberNodes) && 
				checkComplete(root.right, 2 * index + 2, numberNodes));
	}
	
	public static void main(String[]args) {{
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node13(1);
		tree.root.left = new Node13(2);
		tree.root.right = new Node13(3);
		tree.root.left.right = new Node13(5);
		tree.root.left.left = new Node13(4);
		tree.root.right.left = new Node13(6);
		
		int node_count = tree.countNumNodes(tree.root);
		int index = 0;
		
		if(tree.checkComplete(tree.root, index, node_count))
			System.out.println("The tree is a complete binary tree");
		
		else
			System.out.println("The tree is not a complete binary tree");
		}
	}
}