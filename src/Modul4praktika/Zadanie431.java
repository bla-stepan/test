package Modul4praktika;

import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie431 {
    public static void main(String[] args) {

//        StringBuilder sb = new StringBuilder("You ");
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < 50000; i++) {
//            sb.reverse();
//        }
//        System.out.println((System.currentTimeMillis() - startTime));
//
//        String text = "illegal character 2011";
//        Pattern p = Pattern.compile();
//        Matcher matcher = p.matcher(text);

        /*
        Задача 1
        Сгенерировать строку номеров телефонов в формате «+7 (926) 123-4567» с разделителем «;».
        Найти «платиновые» номера телефонов, оканчивающиеся на 6 нулей.
         */
        StringBuilder strBuilder = new StringBuilder("+7 (926) ");//создаем класс стрингбилдер
        Pattern pattern = Pattern.compile("^(\\d{3})(\\d{4})$");//создаем метод шаблон

        for (int i = 1000000; i <= 9999999; i++) {//запускаем цикл для генерации номеров
            Matcher matcher = pattern.matcher(Integer.toString(i));//создаем поиск совпадений и загружаем в него сгенерированный номер (переводим в стринг)
            if (matcher.find()) {//если метод файнд класса матчер подтверждает что строка совпадает с шаблоном то
                strBuilder.append(matcher.group(1)).append("-").append(matcher.group(2)).append("; ");//формируем строку в нужном формате
            }
        }

        pattern = Pattern.compile("(\\d[0]{2})-([0]{4})");//создаем шаблон для поиска
        Matcher matcher2 = pattern.matcher(strBuilder);//создаем объект класса совпадение
        while (matcher2.find()) {
            System.out.println("+7 (926) " + matcher2.group(1) + "-" + matcher2.group(2) + "; ");
        }


    }
}


