public class BT {
	private ArrayList<Integer> BTArray;

	public void insert(int key, String value){

	
	}

	public void searchNode(Node root, Node node1, Node node2){
		for(int i=0; true; i++;) {
			int n_nodes = findNodesInBetween(node1.key, node2.key);
			if(n_nodes != -1){
				return;
			} else {
				BTArray = new ArrayList<>();
				populateNodesByLevel(root,i);
			}
		}

	}

	private void populateNodesByLevel(Node root,int i) {
		if(i == 0){
			BTArray.add(root.key);
		} else {
			populateNodesByLevel(root.left, i-1);
			populateNodesByLevel(root.right,i-1);
		}
	}

	private int findNodesInBetween(int key1, int key2){
		int pos = -1;
		for(int i=0; i< BTArray.size(); i++){
			if(BTArray.get(i) == key1 || BTArray.get(i) == key2) {
				if(pos != -1) {
					return i - pos;
				} else {
					pos = i;
				}
			}
		}
		return -1;
	}
}