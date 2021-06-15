package by.projectShop.controller.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class MenuBean {
    private String nameShop = "Coffee Shop";
    private String coffeeInfo_1 = "Our coffee products provide maximum depth of aroma, unforgettable taste and pleasant aftertaste.\n" ;
    private String coffeeInfo_2 = "If you are planning to buy coffee, but do not know how to choose high-quality coffee, we will be happy to help. Most importantly, decide on the variety. For example, Arabica has a rich, invigorating, and at the same time, mild and sophisticated taste. Whereas robusta is good, not as a single variety, but in combination with the same Arabica or even with several varieties of coffee beans. Not everyone will like the strong and bitter taste of pure robusta, but the correct ratio of grains can make the blend simply amazing.";

    public String getCoffeeInfo_1() {
        return coffeeInfo_1;
    }

    public String getCoffeeInfo_2() {
        return coffeeInfo_2;
    }

    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }
}
