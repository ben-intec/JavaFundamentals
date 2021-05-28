package chapter18;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class TextPrinter {

    private String sentence;

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public TextPrinter(String sentence, Consumer<String> consumer) {
        this.sentence = sentence;
        for (String word : sentence.split(" +")) {
            consumer.accept(word);
        }
    }

    public void printFilteredWords(WordFilter filter) {
        for (String word : sentence.split(" +")) {
            if(filter.isValid(word))
                System.out.println(word);
        }
    }

    public void printProcessedWords(WordProcessor processor) {
        for (String word : sentence.split(" +")) {
            System.out.println(processor.process(word));
        }
    }

    public void PrintNumberValues(NumberParser parser) {
        for (String word : sentence.split(" +")) {
            System.out.println(parser.parse(word));
        }
    }

    public void printSum(NumberParser parser) {
        BigDecimal bd = BigDecimal.ZERO;
        for (String word : sentence.split(" +")) {
            bd = bd.add(parser.parse(word));
        }
        System.out.println(bd);
    }

    public static int convertToASCII(String str){
        int sum=0;
        for(int i=0; i<str.length(); i++)
            sum += str.charAt(i);

        return sum;
    }
}
