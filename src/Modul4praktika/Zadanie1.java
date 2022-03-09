package Modul4praktika;

/*
Задача 1
Напишите класс Balance для описания весов с двумя чашами, которые будут балансировать.
В этом классе должны быть следующие методы:
addRight(int n) — добавить на правую чашу (метод ничего не возвращает);
addLeft(int n) — добавить на левую чашу (метод также ничего не возвращает);
getSituation() — метод вернет =, если вес на обеих чашах равен, R — если вес на правой больше, L — на левой больше.
 */
public class Zadanie1 {
    public static void main(String[] args) {
        Balanse balanse = new Balanse();
        balanse.getSituation();
        balanse.addLeft(5);
        balanse.getSituation();
        balanse.addRight(1);
        balanse.getSituation();
        balanse.addRight(4);
        balanse.getSituation();
        balanse.addRight(1);
        balanse.getSituation();


    }

    public static class Balanse {
        int r;
        int l;

        public Balanse() {
            this.r = l = 0;
        }

        public void addRight(int n) {
            r += n;
            System.out.println("R -" + r + " L -" + l);
        }

        public void addLeft(int n) {
            l += n;
            System.out.println("R -" + r + " L -" + l);
        }

        public char getSituation() {
            char a;
            if (r == l) {
                a = '=';
            } else if (r > l) {
                a = 'R';
            } else a = 'L';
            return a;
        }
    }

}
