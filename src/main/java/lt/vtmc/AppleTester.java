package main.java.lt.vtmc;

public class AppleTester {
    public static void main(String[] args) {
        Apple myApple = new Apple("red", 12.2);

        System.out.println(myApple.getColor());
        System.out.println(myApple.getSize());
        System.out.println(myApple);

        Noris otherApple = new Noris("Green", 25.0, 10);
        System.out.println(otherApple.getColor());
        System.out.println(otherApple.getSize());
        System.out.println(otherApple);
    }
}
