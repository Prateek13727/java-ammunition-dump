import java.util.ArrayList;

/**
 * Created by tracxn-lp-175 on 20/5/17.
 */
public class Branch {

    public String name;

    private ArrayList<Customer> customerEntries;

    public Branch(String name) {
        this.name = name;
        this.customerEntries = new ArrayList<Customer>();
    }
    public void AddOrUpdateCustomer(String name, Double amount) {
        if(findByName(name) != -1 ) {
            Customer customer =  queryCustomer(name);
            if(customer != null) {
                customer.update(amount);
            }
        } else {
            customerEntries.add(new Customer(name, amount));
        }
    }

    public ArrayList<String> getCustomerList() {
        ArrayList<String> nameEntries = new ArrayList<String>();
        for (int i=0; i < this.customerEntries.size(); i++) {
            Customer customer = this.customerEntries.get(i);
            nameEntries.add(customer.name);
        }
        return  nameEntries;
    }
    private int findByName(String name) {
        for (int i=0; i < this.customerEntries.size(); i++) {
            Customer customer = this.customerEntries.get(i);
            if(customer.name.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private Customer queryCustomer(String name) {
        int position = findByName(name);
        if (position >= 0 ) {
            return this.customerEntries.get(position);
        }
        return null;
    }
}
