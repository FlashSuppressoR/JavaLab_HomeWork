package Lesson1.Task2;

import java.util.Objects;

public abstract class Car {
    String carBrand = "Audi";
    String carModel;
    String releaseDate;
    String carColor;
    String enginesType;

    public static void startEngine(){
        System.out.println("Заводит машину.");
    }
    public static void turnOffEngine(){
        System.out.println("Глушит машину.");
    }
    public abstract void reFuel();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;
        if (carModel != car.carModel) return false;
        return Objects.equals(enginesType, car.enginesType);
    }

    @Override
    public int hashCode() {
        int result = enginesType.hashCode();
        result = 31 * result + (carModel != null ? carModel.hashCode() : 0);
        return result;
    }

}
