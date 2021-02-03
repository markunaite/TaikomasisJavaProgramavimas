package Shop;

import java.util.ArrayList;

public class ShopingCart {
    private ArrayList<AbstractProduct> products = new ArrayList<>();

    public void addProduct(AbstractProduct product) {
        products.add(product);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
       // for (AbstractProduct : products) {
        //    totalPrice += products.getPriceWithVat();
     //   }
        return totalPrice;
    }
}
