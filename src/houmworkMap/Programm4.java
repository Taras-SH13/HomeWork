package houmworkMap;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;


public class Programm4 {

    public static void main(String[] args) {
        Library myBooks = new Library();
        myBooks.listOffBooks.put(new LocalDate(2,12,2020), "Пушкин");
        myBooks.listOffBooks.put(new LocalDate(3,12,2020), "Лермонтов");
        myBooks.listOffBooks.put(new LocalDate(23,11,2020), "Некрасов");
        myBooks.listOffBooks.put(new LocalDate(7,10,2021), "Тургеньев");
        myBooks.listOffBooks.put(new LocalDate(13,5,2021), "Чехов");

        System.out.println(Arrays.asList(myBooks.listOffBooks));


    }

}
