package houmworkMap;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class ProgrammPart2 {

    public static void main(String[] args) {

        // создаем отчет библиотеки
        ListOffBooks report=new ListOffBooks();
        report.booksList.put("Незнайка на Луне",LocalDate.of(2020,01,04));
        report.booksList.put("Незнайка в Солнечном Городе",LocalDate.of(2020,01,05));
        report.booksList.put("Приключения Незнайки",LocalDate.of(2020,02,11));
        report.booksList.put("Спартак",LocalDate.of(2020,03,5));
        report.booksList.put("Тайна двух Океанов",LocalDate.of(2020,03,05));
        report.booksList.put("Три мушкетера",LocalDate.of(2020,10,04));
        report.booksList.put("20 лет спустя",LocalDate.of(2020,10,04));
        report.booksList.put("Зверобой",LocalDate.of(2020,5,04));
        report.booksList.put("Маугли",LocalDate.of(2020,5,04));
        report.booksList.put("Марсианин",LocalDate.of(2020,6,25));
        report.booksList.put("Рассказы о животных",LocalDate.of(2020,1,01));

        System.out.println(Arrays.asList(report.booksList));
        System.out.println(report.booksList.containsValue(LocalDate.of(2020,6,25)));

    }



}
