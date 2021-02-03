package Shop;

public abstract class AbstractProduct implements AbleCart {
    private String name;
    private double price;

    public AbstractProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract double getVat();
}
