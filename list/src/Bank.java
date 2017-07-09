import java.util.ArrayList;

/**
 * Created by tracxn-lp-175 on 20/5/17.
 */
public class Bank {

    public String name;
    ArrayList <Branch> branchEntries;

    public Bank(String name) {
        this.name = name;
        this.branchEntries = new ArrayList<Branch>();
    }

    public void addBranch(String name) {
        branchEntries.add(new Branch(name));
    }

    public void addCustomerToBranch(String customerName, String branchName, Double amount) {
        Branch branch = queryBranch(branchName);
        if(branch != null){
            branch.AddOrUpdateCustomer(customerName,amount);
        }
    }

    public ArrayList<String> getCustomerListByBranch(String name) {
        Branch branch = queryBranch(name);
        if(branch != null) {
            return  branch.getCustomerList();
        }
        return null;
    }


    private int findByName(String name) {
        for (int i=0; i < this.branchEntries.size(); i++) {
            Branch branch = this.branchEntries.get(i);
            if(branch.name.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private Branch queryBranch(String name) {
        int position = findByName(name);
        if (position >= 0 ) {
            return this.branchEntries.get(position);
        }
        return null;
    }
}
