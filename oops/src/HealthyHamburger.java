/**
 * Created by pratp on 28/3/17.
 */
public class HealthyHamburger extends Hamburger {

    private String additionalHealthyItem1;
    private Double additionalHealthyItemPrice1;
    private String additionalHealthyItem2;
    private Double additionalHealthyItemPrice2;

    public HealthyHamburger (String name, String meatType, Double basePrice) {
        super(name,"brownRyeBread",meatType,basePrice);
    }

    public void addAdditionalHealthyItem1(String item,Double price) {
        this.additionalHealthyItem1 = item;
        this.additionalHealthyItemPrice1= price;
    }

    public void addAdditionalHealthyItem2(String item,Double price) {
        this.additionalHealthyItem2 = item;
        this.additionalHealthyItemPrice2 = price;
    }

    @Override
    public double itemSizeBurger() {
       double totalPrice = super.itemSizeBurger();
        if (additionalHealthyItem1 != null) {
            totalPrice = totalPrice + this.additionalHealthyItemPrice1;
        }
        if (additionalHealthyItem2 != null) {
            totalPrice = totalPrice + this.additionalHealthyItemPrice2;
        }
        System.out.println("HealthyBurger-totalPrice:" + totalPrice);
        return totalPrice;
    }
}
