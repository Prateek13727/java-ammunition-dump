import java.util.ArrayList;
import java.util.List;

/**
 * Created by tracxn-lp-175 on 8/7/17.
 */
interface ISavable {

    List<String> write();

    void read(List<String> values);
}
