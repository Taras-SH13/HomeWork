package homework_arrays;

public class Random_Array {
    public static void main(String[] args) {

        int random_Array[] = new int[150]; // создали массив для случайных чисел

        for (int i = 0; i < random_Array.length; i++) {
            random_Array[i] = (int) (Math.random() * 200 - 100); // заполнили массив числами -100 до 100
            System.out.println(random_Array[i]);
        }
        int sum = 0;
        for (int i = 0; i < random_Array.length; i++) { // суммируем все положительные числа
            if (random_Array[i] > 0) {
                sum = sum + random_Array[i];
            }
        }
        if (sum >= 0) {
            System.out.println(sum);
        } else System.out.println(0);

        double avg = 0; // среднее значение


        for (int i = 0; i < random_Array.length; i++) { // суммируем все  числа массива
            avg = avg + random_Array[i];

        }
        avg = sum / random_Array.length;
        System.out.println(avg);
    }
}



