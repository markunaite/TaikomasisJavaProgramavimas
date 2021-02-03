package main.java.lt.vtmc;

public abstract class Animal {
    private String name;
    private double age;

    public Animal(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public void eat() {
        System.out.println("Animal is eating...");
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }



}
