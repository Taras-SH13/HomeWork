package homeworkGeneric2;

import java.util.ArrayList;

public class Programm2 {

    public static void main(String[] args) {
        // объекты разных типов,реализующие интерфейс Comparabale
        Integer item1 = 34;
        Integer item2 = 76;
        String item3 = "45555";
        String item4 = "786";

        // создаем список объектов тип Integer
        MyList2<Integer> integerList = new MyList2<>();

        integerList.anyList.add(item1);
        integerList.anyList.add(item2);
        System.out.println(integerList.anyList);
        System.out.println(integerList.anyList.get(0).compareTo(integerList.anyList.get(1)));// сравниваем объекты листа

        // создаем список объектов тип String
        MyList2<String> stringList = new MyList2<String>();

        stringList.anyList.add(item3);
        stringList.anyList.add(item4);
        System.out.println(stringList.anyList);
        System.out.println(stringList.anyList.get(0).compareTo(stringList.anyList.get(1)));


    }


}

