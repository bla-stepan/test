package Modul4praktika;

public class Car {
    private String carModel;
    private String carColor;
    private int oil;
    private String carNomber;
    private int mileage;
    private String history = "";

    public Car(String carModel, String carColor, String carNomber) {
        this.carModel = carModel;
        this.carNomber = carNomber;
        this.oil = 50;
        this.mileage = 0;
        String i = "Выпущен новый автомобиль марки " + carModel + ", цвет: " + carColor + " с номером " + carNomber + ". ";
        System.out.println(i);
        history += i;
    }

    public void carTrip(int trip) {
        getOil();
        getMileage();
        if (oil == trip) {
            mileage += trip;
            oil = 0;
        } else if (oil < trip) {
            mileage += oil;
            trip = oil;
            oil = 0;
        } else {
            oil -= trip;
            mileage += trip;
        }
        String i = "Авто " + getCarModel() + " с номером " + getCarNomber() + " проехал " + trip + "км, пробег - " + mileage + "км, остаток топлива " + oil + "л. ";
        System.out.println(i);
        history += i;
    }

    public void carRefill(int refill) {
        getOil();
        int bak = 0;
        int oststatok = 0;
        if (oil + refill >= 50) {
            bak = 50 - oil;
            oststatok = refill - bak;
            oil = 50;//бак
        } else {
            oil += refill;
            bak = refill;
            oststatok = 0;

        }
        String i = "Авто с номером " + getCarNomber() + " заправлен на " + bak + ", в баке " + oil + " остаток топлива к возврату - " + oststatok + "л. ";
        System.out.println(i);
        history += i;
    }

    public int getMileage() {
        return mileage;
    }

    public int getOil() {
        return oil;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarNomber() {
        return carNomber;
    }

    public String getHistory() {
        return history;
    }

}
