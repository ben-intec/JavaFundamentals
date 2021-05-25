package chapter18;

public class TextPrinter {

    private String sentence;

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public void printWords(WordFilter filter) {
        for (String word : sentence.split(" +")) {
            if(filter.isValid(word))
                System.out.println(word);
        }
    }
}
