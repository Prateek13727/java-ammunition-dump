/**
 * Created by tracxn-lp-175 on 21/5/17.
 */
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        bank.addBranch("SBI-LKO");
        bank.addCustomerToBranch("prateek","SBI-LKO", 500.0);
        System.out.println(bank.getCustomerListByBranch("SBI-LKO"));         
    }
}
