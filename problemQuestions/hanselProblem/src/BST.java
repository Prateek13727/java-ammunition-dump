import java.util.*;

public class BST {
	private Node root=null;

	public void insert(int key, String value){
		Node newNode = new Node();
		newNode.value = value;
		newNode.key = key;

		Node current = root;
		Node parent = root;
		while(true) {
			parent = current;
			if(root == null) {
				root = newNode;
				return;
			}
			else if(newNode.key > current.key) {
				current = current.rightChild;
				if(current == null){
					parent.rightChild = newNode;
					return;
				}
			}
			else if(newNode.key < current.key) {
				current = current.leftChild;
				if(current == null){
					parent.leftChild = newNode;
					return;
				}
			} 
		}
	}

	public Node findMin(Node startingNode){
		Node current = startingNode;
		while(current.leftChild != null) {
			current = current.leftChild;
		}
		return current;
	}

	public Node findMax(Node startingNode){
		Node current = startingNode;
		while(current.rightChild != null) {
			current = current.rightChild;
		}
		return current;
	}

	public Node deleteNode(int key){
		boolean isLeftNode = false;
		Node current = root;
		Node parent = null;
		Node nodeToDelete = null;

		while(current.key != key) {
			if(key < current.key) {
				parent = current;
				current = current.leftChild;
				isLeftNode = true;
			}
			else if (key > current.key) {
				parent = current;
				current = current.rightChild;
				isLeftNode = false;
			}
			if (current == null) {
				return nodeToDelete;
			}
		}

		nodeToDelete = current;

		//case 1:
		if (nodeToDelete.leftChild == null && nodeToDelete.rightChild == null) {
			if(isLeftNode) {
				parent.leftChild = null;
			} else {
				parent.rightChild = null;
			}
		} 
		//case 2 - //case3 - node to delete has one child nodes
		else if (nodeToDelete.leftChild != null && nodeToDelete.rightChild == null) {
			if(isLeftNode) {
				parent.leftChild = nodeToDelete.leftChild;
			} else {
				parent.rightChild = nodeToDelete.leftChild;
			}
		} else if (nodeToDelete.leftChild == null && nodeToDelete.rightChild != null) {
			if(isLeftNode) {
				parent.leftChild = nodeToDelete.rightChild;
			} else {
				parent.rightChild = nodeToDelete.rightChild;
			}
		}
		//case3 - node to delete has two child nodes
		else if (nodeToDelete.leftChild != null && nodeToDelete.rightChild != null) {
			Node successor = getSuccesor(nodeToDelete);
			if(isLeftNode) {
				parent.leftChild = successor;
			} else {
				parent.rightChild = successor;
			}
			successor.leftChild = nodeToDelete.leftChild;
		}

		return nodeToDelete;
	}

	//find minimum key greater than the node to delete
	private Node getSuccesor(Node nodeToDelete){	
		Node successorParent = nodeToDelete;
		Node successor = nodeToDelete;
		Node current = nodeToDelete.rightChild;
		
		while(current.leftChild != null){
			successorParent = current;
			current = current.leftChild;
		}
		
		successor = current;
		
		if(successor != nodeToDelete.rightChild) {
			successorParent.leftChild = successor.rightChild; 
			successor.rightChild = nodeToDelete.rightChild;
		}
		return successor;
	}

	public Node find(int key){
		Node current = root;
		while(true){
			if(key > current.key) {
				current = current.rightChild;
			} 
			else if (key < current.key){
				current = current.leftChild;
			} 
			else {
				return current;
			}
			if (current == null) {
				return current;
			}
		}
	}

	public void displayBST() {
		int height = calculateBSTHeight();
		for(int i=1; i<=height; i++){
			int spaces=height - i;
			int n_spaces=1;
			while(n_spaces <= spaces+3){
				System.out.print("*");
				n_spaces++;
			}
			int j=1;
			while(j <= i){
				System.out.print("Node");				
				j++;
				if(j<=i) {
					System.out.print("*");	
				}
			}
			n_spaces=1;
			while(n_spaces <= spaces+3){
				System.out.print("*");
				n_spaces++;
			}
			System.out.println("");
			System.out.println("------------------------------");
		}
	}

 	public void printLevelOrder(){
        int h = calculateBSTHeight();
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }

    private void printGivenLevel(Node root ,int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.key + " ");
        else if (level > 1)
        {
            printGivenLevel(root.leftChild, level-1);
            printGivenLevel(root.rightChild, level-1);
        }
    }

 	public int calculateBSTHeight(){
		Node current = root;
		return height(current);
	}

	private int height(Node current){
		if(current == null) {
			return 0;
		} else {
			int lheight = height(current.leftChild);
			int rheight = height(current.rightChild);
			if(lheight> rheight) {
				return lheight+1;
			} else {
				return rheight+1;
			}
		}
	}


	public void preOrderTraversal() {
		System.out.println(root.key);
		doPreOrderTraversal(root);
	}

	private void doPreOrderTraversal(Node current){
		if (current.leftChild  != null) {
			System.out.println(current.leftChild.key);
			doPreOrderTraversal(current.leftChild);		
		}
		if (current.rightChild != null) {
			System.out.println(current.rightChild.key);
			doPreOrderTraversal(current.rightChild);	
		}
	}

	public void inOrderTraversal() {
		doInOrderTraversal(root);
	}

	private void doInOrderTraversal(Node current){
		if (current.leftChild  != null) {
			System.out.println(current.leftChild.key);
			doPreOrderTraversal(current.leftChild);		
		}
		System.out.println(root.key);
		if (current.rightChild != null) {
			System.out.println(current.rightChild.key);
			doPreOrderTraversal(current.rightChild);	
		}
	}

	public void postOrderTraversal() {
		doPostOrderTraversal(root);
		System.out.println(root.key);
	}

	private void doPostOrderTraversal(Node current){
		if (current.leftChild  != null) {
			System.out.println(current.leftChild.key);
			doPreOrderTraversal(current.leftChild);		
		}
		if (current.rightChild != null) {
			System.out.println(current.rightChild.key);
			doPreOrderTraversal(current.rightChild);	
		}
	}
}