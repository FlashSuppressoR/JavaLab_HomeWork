package Lesson1.Task2;

import java.util.Objects;

public class Sedan extends Car {
    private int trunkVolume = 140;

    public Sedan(String model, String releaseDate, String color, String engineTypes) {
        this.carModel = model;
        this.releaseDate = releaseDate;
        this.carColor = color;
        this.enginesType = engineTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sedan sedan = (Sedan) o;
        if (!carModel.equals(sedan.carModel)) return false;
        return Objects.equals(enginesType, sedan.enginesType);
    }

    @Override
    public int hashCode() {
        int result = enginesType.hashCode();
        result = 31 * trunkVolume * result + (carModel != null ? carModel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Самый востребованный седан от " + carBrand + ": Модель - " + carModel + ", Дата выпуска - " + releaseDate +
                ", Цвет авто - " + carColor + ", Тип двигателя - " + enginesType;
    }

    @Override
    public void reFuel() {
        System.out.println("C бензином работает заправщик Олег. Он заправляет топливный бак 95 бензином.");
    }

    public int getTrunkVolume() {
        return trunkVolume;
    }

    public void setTrunkVolume(int trunkVolume) {
        this.trunkVolume = trunkVolume;
    }
}
