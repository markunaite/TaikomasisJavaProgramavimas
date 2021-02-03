package main.java.lt.vtmc;

public class Apple {
    private String color;
    private double size;

    public Apple(String color, double size) {
        this.color = color;
        setSize(size);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    private void setSize(double size) {
        if (size >= 15.0) {
            this.size = size;
        } else {
            System.out.println("Bad Apple size");
        }
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
