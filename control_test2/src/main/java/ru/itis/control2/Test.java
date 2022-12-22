package ru.itis.control2;

public class Test {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Horse horse = new Horse();

        System.out.println(cow.output());
        System.out.println(horse.output());

        cow.food();
        horse.food();

        System.out.println(cow.output());
        System.out.println(horse.output());

    }
}
