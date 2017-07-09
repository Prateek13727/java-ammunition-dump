package mobilePhone;

/**
 * Created by pratp on 26/4/17.
 */
public class Main {
    public static void  main (String[] args) {
        Contact contact = Contact.createContact("prateek","8861410904");
        Mobile mobile = new Mobile();
        mobile.add(contact);
        mobile.read();
    }
}
