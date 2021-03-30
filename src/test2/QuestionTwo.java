package test2;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
    Schrijf een main methode die het volgende doet:

    * Maak een 2d integer array van 9x9
    * Vul de volledige array met random integers (kleinste: 1 - grootste: 9)
    * Roep 1 van de methodes op die hieronder staat
    * Het resultaat van de methode afdrukt.

    Schrijf nu methodes met de volgende functionaliteit:

    1. Een methode die de som berekent voor elke rij van de array
    2. Een methode die de som berekent voor elke kolom van de array
    3. Een methode die de som berekent voor de hele array.
 */
public class QuestionTwo {
    public static void main(String[] args) {
        int length = 9;
        int[][] matrix = new int[length][length];
        Random random = ThreadLocalRandom.current();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = random.nextInt(9) + 1;
            }
//            System.out.println(Arrays.toString(matrix[i]));
        }

//        System.out.println();
//        System.out.println(Arrays.toString(sumsOfRows(matrix)));
//        System.out.println();
//        System.out.println(Arrays.toString(sumsOfColumns(matrix)));
        System.out.println();
        System.out.println(sumOfMatrix(matrix));

    }

    public static int[] sumsOfRows(int[][] matrix) {
        int[] sums = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            sums[i] = sumOfArray(matrix[i]);
        }

        return sums;
    }

    public static int[] sumsOfColumns(int[][]matrix) {
        int maxLength = 0;
        for (int[] ints : matrix) {
            maxLength = Math.max(maxLength, ints.length);
        }

        int[][]matrixReversed = new int[maxLength][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixReversed[j][i] = matrix[i][j];
            }
        }

        return sumsOfRows(matrixReversed);
    }

    public static int sumOfMatrix(int[][] matrix) {
        return sumOfArray(sumsOfRows(matrix));
    }

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        return sum;
    }
}
