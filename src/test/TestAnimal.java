package test;

import domain.Rabbit;

public class TestAnimal {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Bunny", 3, 10.5);
        rabbit.eat();
        rabbit.graze();
        rabbit.hop();
        rabbit.dig();
        rabbit.speak();
        System.out.println(rabbit.toString());
    }
}
