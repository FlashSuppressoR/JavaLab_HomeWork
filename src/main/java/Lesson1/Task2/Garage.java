package Lesson1.Task2;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    Map<Car, Integer> parking = new HashMap<>();

    public void enterParking(Car car){
        Integer oldCount = parking.get(car);
        if (oldCount == null ) {
            oldCount = 0;
        }
        parking.put(car, ++oldCount);
    }
    public void leaveParking(Car car){
        Integer newCount = (parking.get(car));
        parking.put(car, --newCount);
    }
    public void getCountCarOnParking(){
        System.out.println("\nПосле тест-драйва проверяем не угнали ли другие авто\nДелаем обход...");
        int test = 0;
        for(Map.Entry<Car, Integer> car : parking.entrySet()){
            System.out.println(car.getKey().carModel + " - " + car.getValue() + " ед.");
            test++;
        }
        if(test == AudiDealerships.keys.size()){
            System.out.println("\nВсё верно!");
        }
        else System.out.println("Походу мы попали на бабки!");
    }
    public void getCountCurrentCarOnParking(Car car){
        System.out.println("На парковке салона осталось " + car.carModel +" " + parking.get(car) +  " ед.\n");
    }
}
