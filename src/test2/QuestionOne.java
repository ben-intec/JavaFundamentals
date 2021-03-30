package test2;

import java.util.Arrays;

/*
Maak een array door de paragraaf hieronder in woorden te delen.
Maak vervolgens een nieuwe array met alle woorden uit de eerste array die meer dan 5 **letters** bevatten en
druk deze array af. Zorg ervoor dat je alleen letters telt!!

The metal–oxide–semiconductor field-effect transistor (MOSFET, MOS-FET, or MOS FET), also known as the metal–oxide–silicon transistor (MOS transistor, or MOS),[1] is a type of insulated-gate field-effect transistor that is fabricated by the controlled oxidation of a semiconductor, typically silicon. The voltage of the covered gate determines the electrical conductivity of the device; this ability to change conductivity with the amount of applied voltage can be used for amplifying or switching electronic signals.
 */
public class QuestionOne {
    public static void main(String[] args) {
        String text = "The metal–oxide–semiconductor field-effect transistor (MOSFET, MOS-FET, or MOS FET), also " +
                "known as the metal–oxide–silicon transistor (MOS transistor, or MOS),[1] is a type of " +
                "insulated-gate field-effect transistor that is fabricated by the controlled oxidation of a " +
                "semiconductor, typically silicon. The voltage of the covered gate determines the electrical " +
                "conductivity of the device; this ability to change conductivity with the amount of applied voltage " +
                "can be used for amplifying or switching electronic signals.";

        String[] words = text.split(" +");

        int count = 0;
        for (String word : words) {
            if (word.length() > 5 && word.matches("^[\\w]+$")) count ++;
        }

        String[] filteredArray = new String[count];
        int index = 0;
        for (String word : words) {
            if ((word.length() > 5 && word.matches("^[\\w]+$"))) {
                filteredArray[index++] = word;
            }
        }

        System.out.println(Arrays.toString(filteredArray));

//        for (String word : filteredArray) {
//            System.out.println(word);
//        }
    }
}
