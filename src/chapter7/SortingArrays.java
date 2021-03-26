package chapter7;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

//Opdracht 1 optioneel 3
public class SortingArrays {

    public static void main(String[] args) {

        int[] ints = { 5, 9, 22, 1, 37, 42, 6, 23, 99, 3, 14, 21, 88, 8 };
        int[] copy = ints.clone();
        System.out.printf("\nUnsorted:      \t%s", Arrays.toString(ints));

        long startTime = System.nanoTime();
        selectionSortArray(ints);
        System.out.printf("\nSelection Sort:\t%s\t took %d ns", Arrays.toString(ints), System.nanoTime() - startTime);


        System.out.printf("\n\nUnsorted:      \t%s", Arrays.toString(copy));

        startTime = System.nanoTime();
        bubbleSortArray(copy);
        System.out.printf("\nBubble Sort:   \t%s\t took %d ns", Arrays.toString(copy), System.nanoTime() - startTime);
    }

    public static void bubbleSortArray(int[] array) {

        boolean isSorted;
        do {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        } while (!isSorted);
    }

    public static void selectionSortArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {

                int low = array[i];

                if (array[j] < array[i]) {

                    array[i] = array[j];
                    array[j] = low;
                    low = array[i];
                }

            }
        }
    }
}
