package houmworkMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class ListOffBooks {
    Map<String, LocalDate> booksList=new HashMap<String, LocalDate>();

    // ищем книгу в мапе
    public void serchBooks2(){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Введите дату в формате : год-месяц-день");
            String dataSerch = sc.nextLine();
            if (booksList.containsValue(dataSerch)) {
                System.out.println(booksList.get(dataSerch));
                return;
            } else {
                System.out.println("Такой книги нет! Попробуйте еще раз! ");
            }
        }
    }
}