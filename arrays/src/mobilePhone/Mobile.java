package mobilePhone;

import java.util.ArrayList;

/**
 * Created by pratp on 26/4/17.
 */
public class Mobile {

    private ArrayList<Contact> arrList = new ArrayList<Contact>();



    public Boolean add(Contact contact) {
        if(!arrList.contains(contact)) {
            arrList.add(contact);
            return true;
        }
        return false;
    }

    public void delete(Contact contact) {
        if (findContact(contact) >= 0) {
            this.arrList.remove(contact);
        } else {
            System.out.println("Contact not found");
        }

    }

    public void read() {
        System.out.println(this.arrList.get(0).getMobNumber());
    }

    public void update(Contact newContact, Contact oldContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println("Contact not found");
        } else {
            arrList.set(foundPosition, newContact);
        }
    }

    private int findContact(Contact contact) {
        return this.arrList.indexOf(contact);
    }

    private int findContact(String contactName) {
        for(int i=0; i<this.arrList.size(); i++) {
            Contact contact = arrList.get(i);
            if (contact.getName() == contactName) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0 ) {
            return contact.getName();
        }
        return null;
    }

    public void printContacts() {
        for (int i=0; i<this.arrList.size(); i++) {
            System.out.println(arrList.get(i).getName());
        }
    }
}
