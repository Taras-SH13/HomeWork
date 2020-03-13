package homework_arrays;
//todo naming
public class Random_Array {
    public static void main(String[] args) {

        int random_Array[] = new int[150]; // создали массив для случайных чисел
        //todo no way to test it with random numbers
        for (int i = 0; i < random_Array.length; i++) {
            random_Array[i] = (int) (Math.random() * 200 - 100); // заполнили массив числами -100 до 100
            System.out.println(random_Array[i]);
        }

        int sum = 0;
        for (int item : random_Array) { // суммируем все положительные числа
            if (item > 0) {
                sum = sum + item;
            }
        }
        System.out.println(Math.max(sum, 0));

        double avg = 0; // среднее значение

        for (int value : random_Array) { // суммируем все  числа массива
            avg = avg + value;
        }
        avg = sum / random_Array.length;
        System.out.println(avg);
    }
}



