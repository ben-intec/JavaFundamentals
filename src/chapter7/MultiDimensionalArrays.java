package chapter7;

import java.util.Arrays;

public class MultiDimensionalArrays {

    //Opdracht 3
    public static void main(String[] args) {
        int[][] grid = { { 1,2,3,4,5,6 }, { 1,2,3,4,5,6 }, { 1,2,3,4,5,6 }, { 1,2,3,4,5,6 } };
        for (int[] ints : grid) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println();

        printProductMatrix(grid);
    }

    public static void printProductMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j : matrix[i]) {
                System.out.printf(j == 1 ? "%d" : "\t%d", (i+1)*j);
            }
            System.out.println();
        }
    }
}
