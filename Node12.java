package Tree;

public class Node12 {
int data;
Node12 leftChild, rightChild;

Node12(int item){
	data = item;
	leftChild = rightChild = null;
}
}

class BinaryTree{
	Node12 root;
	
	//Check for Full Binary Tree
	boolean isFullBinaryTree(Node12 node) {
		
		//Checking tree emptiness
		if(node == null)
			return true;
		
		//Checking the children
		if(node.leftChild == null && node.rightChild == null)
			return true;
		
		if((node.leftChild != null) && (node.rightChild != null))
			return (isFullBinaryTree(node.leftChild) && isFullBinaryTree(node.rightChild));
		
		return false;
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node12(1);
		tree.root.leftChild = new Node12(2);
		tree.root.rightChild = new Node12(3);
		tree.root.leftChild.leftChild = new Node12(4);
		tree.root.leftChild.rightChild = new Node12(5);
		tree.root.rightChild.leftChild = new Node12(6);
		tree.root.rightChild.rightChild = new Node12(7);

		if(tree.isFullBinaryTree(tree.root))
			System.out.print("The tree is a full binary tree");
		else
			System.out.print("The tree is not a full binary tree");
	}
}
