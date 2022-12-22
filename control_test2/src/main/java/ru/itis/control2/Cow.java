package ru.itis.control2;

public class Cow extends Abstract_animals {
    public boolean isFood = false;

    public Cow(boolean isFood) {
        this.isFood = isFood;
    }

    public Cow() {
    }

    @Override
    public void food() {
        isFood = true;
        System.out.println("Корова сыта!");
    }

    @Override
    public void water() {
        isFood = false;
        System.out.println("Корова попила, но очень голодна!"); // ничего не приходит в голову кроме животных
    }

    public boolean output() {
        return isFood;
    }
}
