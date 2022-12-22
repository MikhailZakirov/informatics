package ru.itis.control2;

public class Horse extends Abstract_animals {
    public Boolean isFood = false;

    public Horse(boolean isFood) {
        this.isFood = isFood;
    }

    public Horse() {
    }

    @Override
    public void food() {
        isFood = true;
        System.out.println("Лошадь сыта!");
    }

    @Override
    public void water() {
        isFood = false;
        System.out.println("Лошадь попила но голодна!");
    }

    public boolean output() {
        return isFood;
    }
}