package homeworkListSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Programm3 {
    public static void main(String[] args) {
// Упражнение 1
        AnyList anyList = new AnyList();
        System.out.println("Данный список  " + anyList.listInt);
        ListIterator<Integer> listIterator = (anyList.listInt).listIterator();
        while (listIterator.hasNext()) {
            Integer integer = listIterator.next();
            if (integer % 3 == 0) {
                System.out.println("Удаляем элемент " + integer);
                listIterator.remove();
            }
        }
        System.out.println("Список после обработки " + anyList.listInt);

// Упражнение 2
        ListOffFruits MylistOffFruits = new ListOffFruits();
        ListIterator<String> listIterator2 = (MylistOffFruits.listOffFruits).listIterator();
        System.out.println("Список до обработки " + MylistOffFruits.listOffFruits);
        while (listIterator2.hasNext()) {
            String string = listIterator2.next();
            if (string.equals("Orange")) {
                listIterator2.set("Grapefruit");
                System.out.println("Замена");
            } else {
                System.out.println("Апельсин не найден!");
            }
        }


        System.out.println("Список после обработки " + MylistOffFruits.listOffFruits);
        System.out.println("Апельсинов в списке нет!");

        // Упражнение 3
        AnyList anyList2 = new AnyList();
        AnyList anyList3 = new AnyList();
        compareTooList(anyList2, anyList3);

    }

    public static void compareTooList(AnyList anyList2, AnyList anyList3) {


        for (int i = 0; i < anyList2.listInt2.size(); i++) {
            for (int j = 0; j < anyList3.listInt3.size(); j++) {
                if (anyList2.listInt2.get(i).equals(anyList3.listInt3.get(j)) == true) {
                    System.out.println("Элемент " + i +
                            " первого списка равен элементу " + j + " второго списка.");
                } else {
                    System.out.println("Элемент " + i +
                            " первого списка не равен элементу " + j + " второго списка.");
                }
            }
        }

    }
}