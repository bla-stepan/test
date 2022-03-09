package Modul4praktika;

/*
Задача 3
Опишите класс Payer. В классе должны быть следующие поля:
surname (фамилия, строка);
name (имя, строка);
address (адрес, строка);
cardNumber (номер карты).
Реализуйте конструктор, принимающий эти параметры (surname, name, address, cardNumber) и метод public toString(),
возвращающий строку вида Payer: surname name, address: address, card: cardNumber.
 */
public class Zadanie3 {
    public static class Payer {
        String surname;
        String name;
        String address;
        String cardNumber;

        public Payer(String surname, String name, String address, String cardNummber) {
            this.surname = surname;
            this.name = name;
            this.address = address;
            this.cardNumber = cardNummber;
        }

        public String toString() {
            return "Paer: " + surname + " " + name + ", address: " + address + ", cardNumber " + cardNumber + '.';
        }
    }

    public static void main(String[] args) {
        Payer payer = new Payer("Ivan", "Ivanov", "yaroslavl", "0125925:63");//

        System.out.println(payer.toString());
        System.out.println(payer.toString());
        System.out.println(payer.toString());
    }
        /*
    String surname;
    String name;
    String address;
    String cardNumber;

    public Payer(String surname, String name, String address, String cardNumber){
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    public String toString() {
        return "Paer: " + surname + " " + name + ", address: " + address + ", cardNumber " + cardNumber +".";
    }
    */
}
