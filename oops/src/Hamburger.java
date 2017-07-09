/**
 * Created by pratp on 28/3/17.
 */
public class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;
    private Double basePrice;
    private Double totalPrice;
    protected String additionalItem1;
    protected Double additionalItemPrice1;
    protected String additionalItem2;
    protected Double additionalItemPrice2;

    public Double getBasePrice() {
        return basePrice;
    }

    public Hamburger (String name, String breadType, String meatType, Double basePrice) {
        this.name = name;
        this.breadRollType = breadType;
        this.meat = meatType;
        this.basePrice = basePrice;
    }

    public double itemSizeBurger() {
        Double totalPrice = this.basePrice;
        if (this.additionalItem1 != null) {
            totalPrice = totalPrice + this.additionalItemPrice1;
        }
        if (additionalItem2 != null) {
            totalPrice = totalPrice + this.additionalItemPrice2;
        }
        System.out.println("totalPrice:" + totalPrice);

        return totalPrice;
    }

    public void addAdditionalItem1(String additionalItem, Double price) {
        this.additionalItem1 = additionalItem;
        this.additionalItemPrice1 = price;
    }

    public void addAdditionalItem2(String additionalItem, Double price) {
        this.additionalItem2 = additionalItem;
        this.additionalItemPrice2 = price;
    }

}
