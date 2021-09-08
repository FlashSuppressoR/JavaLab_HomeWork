package Lesson1.Task2;

import java.util.*;

public class AudiDealerships {
    public static Garage garage = new Garage();
    public static final Car sedan1 = new Sedan("S7","11.2020", "Красный", "Бензин 2.0 (147 л.)");
    public static final Car sedan2 = new Sedan("S7","11.2020", "Желтый", "Бензин 2.0 (147 л.)");
    public static final Car electric1 = new Electric("E-Tron Sportback","09.2021", "Серебро", "Электродвигатель");
    public static final Car electric2 = new Electric("E-Tron Sportback GT","09.2021", "Пурпурный", "Электродвигатель");
    public static final Car minivan = new Minivan("TS6","08.2019", "Черный металлик", "Турбо-Дизель 2.4 (161 л.)");
    public static final Car sport1 = new Sport("RS6","08.2020", "Вишневый", "БиТурбо-Бензин 4.4 (675 л.)");
    public static final Car sport2 = new Sport("RS7","03.2021", "Желтый", "БиТурбо-Бензин 5.0 (750 л.)");
    public static List<Car> keys;

    public static void main(String[] args) {
        newArrivalCar();
        showCar();
        shuffleCarToDrive();
        garage.getCountCarOnParking();
    }
    public static void newArrivalCar(){
        garage.enterParking(sedan1);
        garage.enterParking(sedan2);
        garage.enterParking(electric1);
        garage.enterParking(electric2);
        garage.enterParking(minivan);
        garage.enterParking(sport1);
        garage.enterParking(sport2);
    }
    public static void showCar(){
        System.out.println("Добро пожаловать в автосалон AUDI!\nВчера нам поступило несколько авто. Озвучу Вам полный список:\n");
        int countCar = 0;
        for(Map.Entry<Car, Integer> car : garage.parking.entrySet()){
            System.out.println(car.getKey());
            countCar += car.getValue();
        }
        System.out.println("Всего авто в салоне - " + countCar + " автомобилей.");
        System.out.println("\nВыбор за Вами!\n");
    }

    public static void shuffleCarToDrive(){
        Random random = new Random();
        keys = new ArrayList<>(garage.parking.keySet());
        Car randomCar = keys.get(random.nextInt(keys.size()));
        String choice = randomCar.carModel;

        System.out.println("Покупатель задумался...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Хотел бы прокатиться на " + choice);
        getCarToTest(randomCar);
    }
    public static void getCarToTest(Car car){
        car.startEngine();
        System.out.println("Покупатель выехал из гаража на " + car.carModel + " прокатиться.\nСказал, что будет через 3 секунды.\n");
        garage.leaveParking(car);
        garage.getCountCurrentCarOnParking(car);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Покупатель вернул целую и невредимую " + car.carModel + " в гараж.");
        Car.turnOffEngine();
        garage.enterParking(car);
        int newCount = garage.parking.get(car);
        String result = "";
        if(car.enginesType.equals("Электродвигатель")){
            result = " АКБ посадил!";
        }
        else result = " бака спалил!";

        System.out.println("Теперь в гараже " + car.carModel + " " + newCount + " авто\nНичего себе он покатался.. Пол" + result);
        car.reFuel();
    }
}
