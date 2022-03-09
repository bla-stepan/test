package Modul4praktika;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CarMain {
    public static void main(String[] args) {

        Car car1 = new Car("Хонда", "Синий", "z700as77");
        Car car2 = new Car("Ниссан", "Белый", "s751hh78");
        Car car3 = new Car("Ниссан", "Черный", "s085ph99");
        car1.carTrip(20);
        car2.carTrip(60);
        car2.carRefill(65);
        car2.carTrip(25);
        car3.carTrip(25);
        car3.carRefill(10);
        car2.carTrip(10);
        car3.carTrip(5);
        String history = car1.getHistory()+car2.getHistory()+car3.getHistory();
        //System.out.println(history);

        Pattern pattern = Pattern.compile("[^.]*(s751hh78)[^.]*[.]");
        Matcher matcher = pattern.matcher(history);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
