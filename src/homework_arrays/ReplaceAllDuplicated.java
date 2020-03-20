package homework_arrays;
import java.util.Arrays;


public class ReplaceAllDuplicated {

    public static void main(String[] args) {

        int[] array = {3, 2, 3, 1, 4, 2, 8, 3};

        for (int i = 0; i < array.length; i++){

            for (int a=i+1; a <array.length; a++)
            {
                if (array [i]== array[a])
                {array[a]=0;}
            }
        }
        System.out.println("Array checked, duplicates replaced wiht valeu 0");
        for (int k:array
             ) {
            System.out.println(k);
        }
    }
}
