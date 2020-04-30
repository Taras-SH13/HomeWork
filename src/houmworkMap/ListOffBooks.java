package houmworkMap;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.*;


public class ListOffBooks {
    Map<String, LocalDate> booksList = new HashMap<String, LocalDate>();

    Set<Map.Entry<String, LocalDate>> entrySet = booksList.entrySet();

    public void searchObject() throws DateTimeException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите год -");
            int year = sc.nextInt();
            System.out.println("Введите месяц -");
            int month = sc.nextInt();
            System.out.println("Введите день -");
            int day = sc.nextInt();
            LocalDate desiredObject = LocalDate.of(year, month, day);
            if (booksList.containsValue(desiredObject)) {
                for (Map.Entry<String, LocalDate> pair : entrySet) {
                    if (desiredObject.equals(pair.getValue())) {

                        System.out.println("В этот день брали книгу " + "'" + pair.getKey() + "'");// нашли наше значение и возвращаем  ключ
                    }
                }

            } else {
                System.out.println("На эту дату - книг не брали!");
            }
        } catch (DateTimeException e) {

            System.out.println("Не корректная дата!");

        }
    }

    public void returnListOffDate() {
        System.out.println("Диапазон дат взятых книг : " + booksList.values());
    }

    public void listOffBooks() {
        System.out.println("Список книг : " + booksList.keySet());
    }

    public void LibraryReport() {
        System.out.println("Отчет по взятым книгам : " + Arrays.asList(booksList));
    }

}
