package Modul4praktika;
/*
Задача 6
Напишите класс Programmer.
Переменные:
name (имя, строка);
company (имя компании, строка);
position (позиция, строка);
конструктор, принимающий name и company;
метод getPosition(), возвращающий строку — позицию программиста.
метод work(), поднимающий позицию программиста на уровень вверх (с самого начала (при инициализации)
программист — intern (стажер), потом junior (джуниор), далее middle, senior, lead).
 */
public class Zadanie6 {
    String name;
    String company;
    String position;

    public Zadanie6(String name, String company) {
        this.name = name;
        this.company = company;
        position = "intern";
    }

    public String getPosition() {
        return position;
    }

    public void work() {
        switch (position) {
            case "integer": position = "junior"; break;
            case "junior": position = "middle"; break;
            case "middle": position = "senior"; break;
            case "senior": position = "lead"; break;
        }
    }
}
