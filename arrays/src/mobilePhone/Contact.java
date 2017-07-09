package mobilePhone;

/**
 * Created by pratp on 26/4/17.
 */
public class Contact {
    private String name;
    private String mobNumber;

    public static Contact createContact(String name, String number) {
        return new Contact(name,number);
    }

    public Contact(String name, String mobNumber) {
        setName(name);
        setMobNumber(mobNumber);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }

}
