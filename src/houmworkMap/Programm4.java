package houmworkMap;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;


public class Programm4 {

    public static void main(String[] args) {

        Library myBooks = new Library();
        // HashMap в качестве ключей объекты класса MyLocalDate
        myBooks.listOffBooks.put(new MyLocalDate(2, 12, 2020), "Пушкин");
        myBooks.listOffBooks.put(new MyLocalDate(3, 12, 2020), "Лермонтов");
        myBooks.listOffBooks.put(new MyLocalDate(23, 11, 2020), "Некрасов");
        myBooks.listOffBooks.put(new MyLocalDate(7, 10, 2021), "Тургеньев");
        myBooks.listOffBooks.put(new MyLocalDate(13, 5, 2021), "Чехов");
        System.out.println(Arrays.asList(myBooks.listOffBooks));// список книг с датами

        // HashMap в качестве ключей объекты класса LocalDate
        LocalDate specificDate = LocalDate.of(2015, Month.NOVEMBER, 20);

        myBooks.listOffBook2.put(specificDate, "Сказки");
        myBooks.listOffBook2.put(LocalDate.of(2017, Month.NOVEMBER, 30), "Журнал Мурзилка");
        myBooks.listOffBook2.put(LocalDate.of(2015, 10, 4), "Журнал Перец");

        System.out.println(Arrays.asList(myBooks.listOffBook2));

      // HashMap в качестве ключей объекты класса String

        myBooks.listOffBook3.put("2016-08-16", "За рулем");
        myBooks.listOffBook3.put("2016-08-18", "ЧИП");
        myBooks.listOffBook3.put("2016-09-6", "Компьютерное обозрение");

        System.out.println(Arrays.asList(myBooks.listOffBook3));

      // ищем книгу по дате
        myBooks.serchBooks();
    }


}
