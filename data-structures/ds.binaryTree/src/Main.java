public class Main {
	public static void main(String[] args){
		BST tree = new BST();
		tree.insert(70,"seventy");
		tree.insert(40,"forty");
		tree.insert(80,"eighty");
		tree.insert(25,"twenty-five");
		tree.insert(45,"forty-five");
		tree.insert(43,"forty-three");
		tree.insert(42,"forty-two");
		tree.insert(41,"forty-one");
		tree.insert(46,"forty-six");
		tree.insert(75,"seventy-five");
		tree.insert(85,"eighty-five");
		tree.insert(76,"seventy-six");
		tree.insert(77,"seventy-seven");
		tree.insert(86,"eighty-six");
		tree.insert(84,"eighty-four");
		tree.insert(94,"ninety-four");
		tree.printLevelOrder();
		// System.out.println(tree.findMin(70).key);
		// System.out.println(tree.findMax(70).key);
		// System.out.println(tree.deleteNode(85));
		// System.out.println(tree.deleteNode(80));
		// tree.deleteNode(40);
		// tree.preOrderTraversal();
		// tree.inOrderTraversal();
		// tree.postOrderTraversal();
		// System.out.println(tree.calculateBSTHeight());
		// tree.displayBST();
		// tree.printLevelOrder();
		// MergeSort mergeSort = new MergeSort();
		// int[] inputArray = { 13,17,6,10,2,19,345,90,3,4,78 };
		// mergeSort.sort(inputArray,0,10);
		// System.out.println("printing array");
		// for(int i=0; i<inputArray.length; i++){
		// 	System.out.println(inputArray[i]);
		// }

	}
}