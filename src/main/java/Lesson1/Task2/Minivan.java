package Lesson1.Task2;

public class Minivan extends Car{
    public Minivan(String model, String releaseDate, String color, String engineTypes) {
        this.carModel = model;
        this.releaseDate = releaseDate;
        this.carColor = color;
        this.enginesType = engineTypes;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
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
}
