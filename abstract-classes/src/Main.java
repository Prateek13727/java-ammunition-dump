/**
 * Created by tracxn-lp-175 on 15/8/17.
 */
public class Main {
    public static void main(String[] args) {

        MyLinkedList linkedList  = new MyLinkedList(null);
//        linkedList.traverse(linkedList.getRoot());
        String stringData = "5 7 8 3 4 5 1 6";

        String[] data = stringData.split(" ");
        for (String s : data) {
            linkedList.addItem(new Node(s));
        }
        linkedList.traverse(linkedList.getRoot());
        linkedList.removeItem(new Node("6"));
        linkedList.traverse(linkedList.getRoot());
        linkedList.addItem(new Node("6"));
        linkedList.traverse(linkedList.getRoot());
    }
}
