package Modul4praktika;

public class StsnokMain {
    public static void main(String[] args) {

        Stanok stanok = new Stanok("#1", 100);
        Stanok stanok1 = new Stanok("#2", 55);

        stanok.goStanok(50);
        stanok1.goStanok(50);
        stanok.goStanok(45);
        stanok1.goStanok(6);

    }
}
