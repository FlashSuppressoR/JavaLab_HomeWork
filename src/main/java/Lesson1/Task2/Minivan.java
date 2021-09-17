package Lesson1.Task2;

import java.util.Objects;

public class Minivan extends Car {
    private int seats = 9;

    public Minivan(String model, String releaseDate, String color, String engineTypes) {
        this.carModel = model;
        this.releaseDate = releaseDate;
        this.carColor = color;
        this.enginesType = engineTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Minivan minivan = (Minivan) o;
        if (!carModel.equals(minivan.carModel)) return false;
        return Objects.equals(enginesType, minivan.enginesType);
    }

    @Override
    public int hashCode() {
        int result = enginesType.hashCode() * seats;
        result = 31 * result + (carModel != null ? carModel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Практичный семейный автомобиль: Модель - " + carModel + ", Дата выпуска - " + releaseDate +
                ", Цвет авто - " + carColor + ", Тип двигателя - " + enginesType;
    }

    @Override
    public void reFuel() {
        System.out.println("Олег и тут спец! Заправляет топливный бак дизелем ДТ-3-К5");
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
