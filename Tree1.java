package Tree;

class Tree1 {
int item;
Tree1 left, right;

public Tree1(int key) {
	item = key;
	left = right = null;
}
}

class BinaryTree{
	Tree1 root;
	
	BinaryTree(){
		root = null;
	}
	
	void postorder(Tree1 node) {
		if(node == null)
			return;
		//Traverse left
		postorder(node.left);
		//Traverse right
		postorder(node.right);
		//Traverse root
		System.out.println(node.item + "->");
	}
	
	void inorder(Tree1 node) {
		if(node == null)
			return;
		
		//Traverse left
		inorder(node.left);
		//Traverse root
		System.out.print(node.item + "->");
	}
	
	void preorder(Tree1 node) {
		if (node == null)
			return;
		
		//Traverse root
		System.out.print(node.item + "->");
		//Traverse left
		preorder(node.left);
		//Traverse right
		preorder(node.right);
	}

	public static void main(String[]args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Tree1(1);
		tree.root.left = new Tree1(12);
		tree.root.right = new Tree1(9);
		tree.root.left.left = new Tree1(5);
		tree.root.left.right = new Tree1(6);
		
		System.out.println("Inorder traversal");
		tree.inorder(tree.root);
		
		System.out.println("\nPreorder traversal ");
		tree.preorder(tree.root);
		
		System.out.println("\nPostorder traversal ");
		tree.postorder(tree.root);
	}
}

