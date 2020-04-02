package homeworkListSet;

import java.util.ListIterator;

public class Programm3 {
    public static void main(String[] args) {

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
    }

}
