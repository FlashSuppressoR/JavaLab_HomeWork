package Lesson1.Task2;

import java.util.Objects;

public class Sport extends Car {
    private double secTo100 = 5.3;

    public Sport(String model, String releaseDate, String color, String engineTypes) {
        this.carModel = model;
        this.releaseDate = releaseDate;
        this.carColor = color;
        this.enginesType = engineTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sport sport = (Sport) o;
        if (!carModel.equals(sport.carModel)) return false;
        return Objects.equals(enginesType, sport.enginesType);
    }

    @Override
    public int hashCode() {
        int result = enginesType.hashCode() * (int) secTo100;
        result = 31 * result + (carModel != null ? carModel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Мощный и быстрый авто от " + carBrand + ": Модель - " + carModel + ", Дата выпуска - " + releaseDate +
                ", Цвет авто - " + carColor + ", Тип двигателя - " + enginesType;
    }

    @Override
    public void reFuel() {
        System.out.println("Подбегает Олег и заправляет топливный бак 98 бензином.");
    }

    public double getSecTo100() {
        return secTo100;
    }

    public void setSecTo100(double secTo100) {
        this.secTo100 = secTo100;
    }
}
