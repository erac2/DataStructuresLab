package Tree;

class PerfectBinaryTree {

	static class Node{
		int key;
		Node left, right;
	}
	
	//Calculate the depth
	static int depth(Node node) {
		int d = 0;
		while(node != null) {
			d++;
			node = node.left;
		}
		return d;
	}
	
	//Check if the tree is perfect binary tree
	static boolean is_perfect(Node root, int d, int level) {

		//Check if the tree is empty
		if(root == null)
			return true;
		return is_perfect(root.left, d, level + 1) && is_perfect(root.right, d, level + 1);

	}
	
	//Wrapper function
	static boolean is_Perfect(Node root) {
		int d = depth(root);
		return is_perfect(root, d, 0);
	}
	
	//Create a new node
	static Node newNode(int k) {
		Node node = new Node();
		node.key = k;
		node.right = null;
		node.left = null;
		 return node;
	}
	
	public static void main(String[]args) {
		Node root = null;
		root = newNode(1);
		root.left = newNode(2);
		root.right = newNode(3);
		root.left.left = newNode(4);
		root.left.right = newNode(5);
	}
}
