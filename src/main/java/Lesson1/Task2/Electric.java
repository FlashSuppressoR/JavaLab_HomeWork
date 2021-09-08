package Lesson1.Task2;

public class Electric extends Car{
    public Electric(String model, String releaseDate, String color, String engineTypes) {
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
        return "Если Вы предпочитаете электромобиль, то советую посмотреть новинку от " + carBrand + ": Модель - " + carModel + ", Дата выпуска - " + releaseDate +
                ", Цвет авто - " + carColor + ", Тип двигателя - " + enginesType;
    }

    @Override
    public void reFuel() {
        System.out.println("Спец по электрокарам, Вадим - вступает в бой! Заряжает АКБ до 100%");
    }
}
