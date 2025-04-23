package domain;

public class Rabbit extends HerbivoreAnimal {
    private double earLength;

    public Rabbit() {
        System.out.println("Default Rabbit created.");
    }

    public Rabbit(String name, int weight, double earLength) {
        this.name = name;
        this.weight = weight;
        this.earLength = earLength;
        System.out.println("Rabbit created with name, weight, and earLength.");
    }

    public void hop() {
        System.out.println(name + " is hopping.");
    }

    public void dig() {
        System.out.println(name + " is digging.");
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Sniff sniff.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Ear Length: " + earLength;
    }
}
