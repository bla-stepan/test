package Modul4praktika;
/*
Задача 4
Создать класс Dog. У собаки должны быть следующие поля:

name (кличка, строка);
age (возраст, число).
Оба поля должны быть приватными и иметь геттеры и сеттеры.

Реализуйте в классе конструктор, принимающий данные поля (name, age).

Создайте метод bark() (лаять), метод должен возвращать строку woof.
 */
public class Zadanie4 {
    private String name;
    private int age;

    public Zadanie4(String name, int age){
        this.name =name;
        this.age =age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Zadanie4 setAge(int age) {
        this.age = age;
        return this;
    }

    public Zadanie4 setName(String name) {
        this.name = name;
        return this;
    }

    public void bark(){
        System.out.println("woof");
    }

    public static void main(String[] args) {

    }
}
