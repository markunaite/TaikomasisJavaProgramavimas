package main.java.lt.vtmc;

public class Noris extends Apple {

    public double weight;

    public Noris(String color, double size, double weight) {
        super(color, size);
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Apple{" +
                "color='" + getColor() + '\'' +
                ", size=" + getSize() +
                ", weight=" + this.weight +
                '}';
    }
}
