import java.lang.Math;
import java.util.*;

//Max heap tree
public class Heap {
	Node root;
	ArrayList<Node> heapData = new ArrayList<>();
	
	public void insert(int key, String value){
		Node node = new Node();
		node.key = key;
		node.value = value;
		if(root == null) {
			root = node;
			heapData.add(root);
		} else {
			heapData.add(node);
			setCorrectMaxHeapDataAfterInsert();
		}
	}

	public void delete(int key) {
		int indexToDelete = findIndexByKey(key);
		if(indexToDelete == -1) {
			return;
		}
		Node nodeToReplaceWith = getNodeToReplaceWith();
		//delete operation
		heapData.set(indexToDelete, nodeToReplaceWith);
		setCorrectMaxHeapDataAfterDelete(indexToDelete);
	}

	public void displayHeap() {
		for(int i=0; i < heapData.size(); i++){
			System.out.println(heapData.get(i).key);
		}
	}

	private void setCorrectMaxHeapDataAfterDelete(int deletedIndex) {
		int childIndex = getBiggerChildIndex(deletedIndex);
		if(childIndex == -1) {
			return;
		}
		Node child = heapData.get(childIndex);
		int parentIndex = deletedIndex;
		Node parent = heapData.get(deletedIndex);
		while(parent.key < child.key){
			heapData.set(parentIndex, child);
			heapData.set(childIndex, parent);
			parentIndex = childIndex;
			childIndex = getBiggerChildIndex(parentIndex);
			if(childIndex == -1) {
				return;
			}
			child = heapData.get(childIndex);		
		}
	}

	private Integer getBiggerChildIndex(int parentIndex) {
		Node rightChild = new Node();
		Node leftChild = new Node();
		int rightChildIndex = getRightChildIndex(parentIndex);
		if(rightChildIndex > heapData.size()-1) {
			rightChild.key = -1;
		} else {
			rightChild = heapData.get(rightChildIndex);
		}

		int leftChildIndex = getLeftChildIndex(parentIndex);
		if(leftChildIndex > heapData.size()-1) {
			leftChild.key = -1;
		} else {
			leftChild = heapData.get(leftChildIndex);
		}
 
		if(leftChild.key < rightChild.key) {
			return rightChildIndex;
		} 
		else if (leftChild.key > rightChild.key) {
			return leftChildIndex;
		} 
		else {
			return -1;
		}
	}

	private Node getNodeToReplaceWith() {
		int lastIndex = heapData.size()-1;
		Node lastNode = heapData.get(lastIndex);
		heapData.remove(lastIndex);
		return lastNode;
	}

	private Integer findIndexByKey(int key) {
		for(int i=0; i < heapData.size(); i++){
			if(heapData.get(i).key == key) {
				return i;
			}
		}
		return -1;
	}

	private void setCorrectMaxHeapDataAfterInsert() {
		int currentIndex = heapData.size() - 1;
		Node current = heapData.get(currentIndex);
		int parentIndex = getParentIndex(currentIndex);
		Node parent = heapData.get(parentIndex);
		while(parent.key < current.key){
			//swap
			heapData.set(currentIndex, parent);
			heapData.set(parentIndex, current);
			currentIndex = parentIndex;
			parentIndex = getParentIndex(currentIndex);
			parent = heapData.get(parentIndex);
		}
	}

	private Integer getRightChildIndex(int index) {
		return (2*index + 1);
	}

	private Integer getLeftChildIndex(int index) {
		return (2*index + 2);	
	}

	private Integer getParentIndex(int index) {
		return (int)Math.floor((index-1)/2);
	}
}