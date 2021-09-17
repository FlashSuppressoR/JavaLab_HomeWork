package Lesson1.Task2;

import java.util.Objects;

public class Electric extends Car {
    private int batteryCapacity = 85;

    public Electric(String model, String releaseDate, String color, String engineTypes) {
        this.carModel = model;
        this.releaseDate = releaseDate;
        this.carColor = color;
        this.enginesType = engineTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Electric electric = (Electric) o;
        if (!carModel.equals(electric.carModel)) return false;
        return Objects.equals(batteryCapacity, electric.batteryCapacity);
    }

    @Override
    public int hashCode() {
        int result = enginesType.hashCode() + batteryCapacity;
        result = 31 * result + (carModel != null ? carModel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Если Вы предпочитаете электромобиль, то советую посмотреть новинку от " + carBrand + ": Модель - " + carModel + ", Дата выпуска - " + releaseDate +
                ", Цвет авто - " + carColor + ", Тип двигателя - " + enginesType;
    }

    @Override
    public void reFuel() {
        System.out.println("Спец по электрокарам, Вадим - вступает в бой! Заряжает АКБ до 100%");
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
