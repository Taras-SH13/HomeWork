package homework_arrays;

import java.util.Arrays;
import java.util.Collections;

public class MyArrays {

    public static void main(String[] args) {

        int[] array = {2, 3, 1, 7, 11}; // инициализируем массив не сортированных целых чисел
        for (int i : array
        ) {
            System.out.println(i);
        }
        Arrays.sort(array); // сортировка по возрастанию
        for (int i : array
        ) {
            System.out.println(i);
        }
        Integer[] new_array = new Integer[array.length]; // создаем новый массив и заполняем отсортированными значениями int (автоупаковка)
        for (int i = 0; i < new_array.length; i++) {
            new_array[i] = array[i];
        }
        for (Integer i : new_array
        ) {
            System.out.println(i);
        }

        Arrays.sort(new_array, Collections.reverseOrder()); // сортировка по убыванию
        for (Integer i : new_array
        ) {
            System.out.println(i);// вывод в консоль отсортированного массива
        }


    }


}