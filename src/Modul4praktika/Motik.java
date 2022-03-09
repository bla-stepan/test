package Modul4praktika;

/*
Задача 8
Создать класс Мотоцикл (Motorbike), с полями: «Год выпуска», «Цвет», «Модель». Создать экземпляр класса Мотоцикл
с помощью конструктора (сеттеры не использовать). Использовать ключевое слово this. Геттером получить год выпуска,
цвет, модель, вывести значения в консоль.
Пример вывода:
Honda
2020
Black
 */
public class Motik {
    private int year;
    private String color;
    private String model;

    public Motik(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void printMotik() {
        System.out.println(getModel() + "\n" + getColor() + "\n" + getYear());
    }
}
