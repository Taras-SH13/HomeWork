package houmworkMap;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Library {

    HashMap<MyLocalDate, String> listOffBooks = new HashMap<MyLocalDate, String>();
    HashMap<LocalDate, String> listOffBook2 = new HashMap<LocalDate, String>();
    HashMap<String, String> listOffBook3 = new HashMap<String, String>();

public void serchBooks(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Введите дату в формате : год-месяц-день");
    String dataSerch=sc.nextLine();
    System.out.println(listOffBook3.get(dataSerch));


}
}

