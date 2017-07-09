/**
 * Created by pratp on 28/3/17.
 */
public class Main {
    public static void main(String[] args) {
//        Hamburger burger = new Hamburger("base","honeyOats", "sausage", 120.0);
//        burger.addAdditionalItem1("carrots", 30.0);
//        burger.itemSizeBurger();
//
        HealthyHamburger burger = new HealthyHamburger("healthyChicken","chickenbreasts",140.0);
        burger.addAdditionalItem1("carrots", 30.0);
        burger.addAdditionalHealthyItem1("brocolli", 30.0);
        burger.itemSizeBurger();
    }
}
