/*Hannah Posch
* HW 5, Summer 2018
* The code will use a main method to build a binary tree and test the functions several times
* with a variety of cases. The results will be printed to the user.
* The textbook, Data Structures and Algorithm Analysis in Java, was consulted for this project.
*/

public class HW5 {
	
	/*
	 * main : This method will call the newly added functions to test them with various values. The
	 * results will be printed to the user to ensure the functions work correctly.
	 * @precondition: The method must instantiate a binary tree to continue.
	 */
	public static void main(String[] args) {
	
		//Binary Tree built
		BinaryTree<String> tree0 = new BinaryTree<>();
		BinaryTree<String> tree1 = new BinaryTree<>("f",new BinaryTree<>("g"),tree0);
		//tree1.printTreeLevelOrder();
	 	BinaryTree<String> tree2 = new BinaryTree<>();
	 	//tree2.printTreeLevelOrder();
	 	BinaryTree<String> tree3 = new BinaryTree<>("c",tree2, tree1);
	 	//tree3.printTreeLevelOrder();
	 	tree3 = new BinaryTree<>("a", new BinaryTree<>("b",new BinaryTree<>("d"),new BinaryTree<>("e")), tree3);
	 	//tree3.printTreeLevelOrder();
	 	
	 	//Orders are printed 
		System.out.println("=======PreOrder=========");
		tree3.printTreePreOrder(); // Can't tell the structure of the tree
		System.out.println("========LevelOrder===========");
		tree3.printTreeLevelOrder(); 
		System.out.println("=======PostOrder=========");
		tree3.printTreePostOrder(); // Can't tell the structure of the tree
		System.out.println("=======InOrder=========");
		tree3.printTreeInOrder(); // Can't tell the structure of the tree
		
		//Size and depth test
		System.out.println("Size: " + tree3.size());
		System.out.println("Depth of Node b: " + tree3.depth("b"));
		System.out.println("Depth of Node f: " + tree3.depth("f"));
		System.out.println("Depth of Node a: " + tree3.depth("a"));
		System.out.println("Depth of Node z: " + tree3.depth("z"));
		System.out.println("Depth of Node g: " + tree3.depth("g"));
		System.out.println("Depth of Node c: " + tree3.depth("c"));
		
		//Empty tree case
		System.out.println("=======Empty==Tree=========");
		BinaryTree<String> tree8 = new BinaryTree<>();
		System.out.println("Size: " + tree8.size());
		System.out.println("Depth of Node b: " + tree8.depth("b"));
		System.out.println("Depth of Node f: " + tree8.depth("f"));
		//Orders are printed 
		System.out.println("=======PreOrder=========");
		tree8.printTreePreOrder(); // Can't tell the structure of the tree
		System.out.println("========LevelOrder===========");
		tree8.printTreeLevelOrder(); 
		System.out.println("=======PostOrder=========");
		tree8.printTreePostOrder(); // Can't tell the structure of the tree
		System.out.println("=======InOrder=========");
		tree8.printTreeInOrder(); // Can't tell the structure of the tree
		
		
		//Binary Tree built with longer strings
		BinaryTree<String> treeA = new BinaryTree<>();
		BinaryTree<String> treeB = new BinaryTree<>("feather",new BinaryTree<>("goat"),treeA);
		BinaryTree<String> treeC = new BinaryTree<>("lion",new BinaryTree<>("grape"),treeB);
		BinaryTree<String> treeD = new BinaryTree<>("cat",treeC, new BinaryTree<>("dog"));
		treeD = new BinaryTree<>("apple", new BinaryTree<>("band",treeB, treeD), treeC);
		treeD.printTreeLevelOrder(); 
		
		//Long string Tree test
		System.out.println("Size: " + treeD.size());
		System.out.println("Depth of Node b: " + treeD.depth("b"));
		System.out.println("Depth of Node feather: " + treeD.depth("feather"));
		System.out.println("Depth of Node 2: " + treeD.depth("2"));
		System.out.println("Depth of Node goat: " + treeD.depth("goat"));
		System.out.println("Depth of Node lion: " + treeD.depth("lion"));
		//Orders are printed 
		System.out.println("=======PreOrder=========");
		treeD.printTreePreOrder(); // Can't tell the structure of the tree
		System.out.println("========LevelOrder===========");
		treeD.printTreeLevelOrder(); 
		System.out.println("=======PostOrder=========");
		treeD.printTreePostOrder(); // Can't tell the structure of the tree
		System.out.println("=======InOrder=========");
		treeD.printTreeInOrder(); // Can't tell the structure of the tree
	}

}
