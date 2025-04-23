package domain;

public class Animal {
    protected String name;
    protected int weight;

    public Animal() {
        System.out.println("Animal created.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void speak() {
        System.out.println(name + " makes a sound.");
    }

    public String toString() {
        return "Name: " + name + ", Weight: " + weight;
    }
}
