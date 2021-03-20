package Chapter6;

import Tools.Utils;

import java.util.Random;

public class StringObjects {

    public static void main(String[] args) {

        var string1 = Utils.getRandomString();
        printStringAndLength(string1);
        System.out.println();
        printAllCaps(string1);
        System.out.println();
        printAllLowerCase(string1);
        System.out.println();
        printReplaceAWithO(string1);
        System.out.println();
        countE(string1);
        System.out.println();

        String string2;
        do {
            string2 = Utils.getRandomString();
        } while (string1.equals(string2));

        compareStrings(string1,string2);
        System.out.println();
        sortStringsAlphabetically(string1, string2);

        String string3 = addSpaces(Utils.getRandomString());

        System.out.println();
        printTrimmedString(string3);


    }

    public static String getRandomString(String[] stringArray) {
        int index = new Random().nextInt(stringArray.length);
        return stringArray[index];
    }

    // Print text + length
    public static void printStringAndLength(String string) {
        System.out.printf("String:\"%s\" has a length of %d%n", string, string.length());
    }

    // ALL CAPS
    public static void printAllCaps(String string) {
        System.out.println(string.toUpperCase());
    }

    // all lowercase
    public static void printAllLowerCase(String string) {
        System.out.println(string.toLowerCase());
    }

    // Replace 'a' with 'o'
    public static void printReplaceAWithO(String string) {
        System.out.println(string.replace('a','o'));
    }

    // count n of 'e'
    public static void countE(String string) {
        int count = 0;
        for(var c : string.toCharArray()){
            if (c == 'e') count++;
        }
        System.out.printf("String:\"%s\" has %d e's%n", string, count);
    }

    // compare 2 strings
    public static void compareStrings(String s1, String s2) {
        System.out.println(s1);
        System.out.println(s2);
        System.out.printf("These strings are %sequal!%n",s1.equals(s2) ? "" : "NOT ");
    }

    // order strings alphabetically
    public static void sortStringsAlphabetically(String s1, String s2) {
        if (s1.compareToIgnoreCase(s2) < 0)
            System.out.printf("%s%n%s%n", s1, s2);
        else if (s1.compareToIgnoreCase(s2) > 0)
            System.out.printf("%s%n%s%n", s2, s1);
        else compareStrings(s1, s2);
    }

    // trim string
    public static void printTrimmedString(String string) {
        System.out.println(string.trim());
    }

    public static String addSpaces(String string) {
        return "    " + string + "     ";
    }
}
