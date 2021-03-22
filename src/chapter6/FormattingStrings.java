package chapter6;
//Opdracht 5
public class FormattingStrings {
    public static void main(String[] args) {

        for (int i = 100; i < 2001; i+=50) {
            System.out.printf("%.2f m\t  =  %.2f ft%n", i/100f, i * 0.03280839895);
        }
    }
}
