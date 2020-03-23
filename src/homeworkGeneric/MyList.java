package homeworkGeneric;

import java.util.ArrayList;


 class MyList<T extends Number> {

    public ArrayList<T> myList=new ArrayList<T>();

    public void add(T item1, T item2){ // добавляем в список myList объекты класса Number

        myList.add(item1);
        myList.add(item2);

    }
    public T max (T item1, T item2){ // метод сравнивает поля в объектах и возвращает больший
      if (item1.getItem()>item2.getItem()) {
          return item1;
      }
      else {return item2;}

    }

     public T min (T item1, T item2){ // метод сравнивает поля в объектах и возвращает меньший
         if (item1.getItem()<item2.getItem()) {
             return item1;
         }
         else {return item2;}

     }
 }



