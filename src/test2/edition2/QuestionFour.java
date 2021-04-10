package test2.edition2;

import java.util.Arrays;

/*
    Maak een 2d 9x9 String array aan.
    Vul elk element met zijn "coordinaten"
    En druk vervolgens de array af
 */
public class QuestionFour {
    public static void main(String[] args) {
        String[][] grid = new String[9][9];

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                grid[row][col] = String.format("(%d, %d)", row, col);
            }
            System.out.println(Arrays.toString(grid[row]));
        }
    }
}
