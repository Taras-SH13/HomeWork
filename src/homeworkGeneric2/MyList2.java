package homeworkGeneric2;

import java.util.ArrayList;
import java.util.Objects;

public class MyList2<T extends Comparable<T>> { // класс типизирован параметром Т который обязательно реализуе интерфейс Comparable
    public ArrayList<T> anyList = new ArrayList<T>();


}
