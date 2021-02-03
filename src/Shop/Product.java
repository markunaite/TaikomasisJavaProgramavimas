package Shop;

public class Product extends AbstractProduct {
    private static final double PRODUCT_VAT = 1.21;

    public Product(String name,double price) {
        super(name, price);
    }

    @Override
    public double getVat() {
        return PRODUCT_VAT;
    }

    @Override
    public double getPriceWithVat() {
        return getPrice() * getVat();
    }
}
