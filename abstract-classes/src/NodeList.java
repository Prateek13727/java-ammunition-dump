/**
 * Created by tracxn-lp-175 on 16/8/17.
 */
public interface NodeList {
    ListItem getRoot();
    Boolean addItem(ListItem item);
    Boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
