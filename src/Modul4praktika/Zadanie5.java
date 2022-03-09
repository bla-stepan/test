package Modul4praktika;
/*
Задача 5
Создайте класс Human со следующими полями:

name (имя, строка);
age (возраст, число);
weight (вес, число);
address (адрес, строка);
work (работа, строка).
Создайте 5 инициализаторов (конструкторов), принимающих:

name, age;
name, address;
name, age, weight;
name, age, work;
age, weight, address, work.
Задача конструктора — создать полноценный объект (сделать его валидным). То есть, если вес неизвестен, то нужно указать
хоть какой-нибудь средний вес, то же касается возраста и имени, а вот адреса и работы может и не быть (равны null).
 */
public class Zadanie5 {
    /*
    public class Human {
    String name;
    int age;
    int weight;
    String address;
    String work;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
        weight = 75;
    }

    public Human(String name, String address){
        this.name = name;
        this.address = address;
        age = 40;
        weight = 75;
    }

    public Human(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Human(String name, int age, String work){
        this.name = name;
        this.age = age;
        this.work = work;
        weight = 75;
    }

    public Human(int age, int weight, String address, String work){
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
        name = "name";
    }
}
     */

}
