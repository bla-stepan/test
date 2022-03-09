package Modul4praktika;

/*
Задача 2
Напишите класс Bell, имеющий всего один метод sound, если он был вызван, то метод должен напечатать
в консоль ding или dong. Первый звук всегда ding, второй — dong, третий — снова ding и так далее.
 */
public class Zadanie2a {
    boolean ding = true;

    public void sound() {
        if (ding = true) {
            System.out.println("ding");
        } else {
            System.out.println("dong");
        }
        ding = !ding;
    }

    public static void main(String[] args) {

    }
}

