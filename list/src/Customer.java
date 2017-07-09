import java.util.ArrayList;

/**
 * Created by tracxn-lp-175 on 20/5/17.
 */
public class Customer {

    public String name;
    ArrayList transactions = new ArrayList<Double>();

    public Customer(String name, Double amount) {
        this.name = name;
        this.transactions.add(amount);
    }

    public void update(double amount) {
        this.transactions.add(amount);
    }
}
