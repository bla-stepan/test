package Modul4praktika;

/*
Задача 7
Напишите класс станка на заводе. У станка есть наименование и количество остатка масла для выполнения единиц деталей.
Станок может быть в статусе «Недоступен для работы», если для следующей работы не хватает единиц масла.
 */
public class Stanok {
    private String marka;
    private int oil;

    public Stanok(String marka, int oil) {
        this.marka = marka;
        this.oil = oil;
        System.out.println("Смонтирован станок "+marka+" с запасом масла - "+oil+"л.");
    }

    public void goStanok(int detal) {
        int tz = detal;
        String status;
        if (getOil() == detal) {
            oil = 0;
        } else if (getOil() < detal) {
            detal = getOil();
            oil = 0;
        } else {
            oil -= detal;
        }
        if (oil == 0) status = "Не доступен для работы";
        else status = "Готов к работе";
        String str = String.format("Задание изготовить %d деталей. На станке %s изготовлено %d деталей, остаток масла %d, статус станка (%s)", tz, getMarka(), detal, oil, status);
        System.out.println(str);
    }

    public int getOil() {
        return oil;
    }

    public String getMarka() {
        return marka;
    }
}
