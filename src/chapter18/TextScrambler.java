package chapter18;

public class TextScrambler {

    public String scramble(String string) {
        return string.replaceAll("a", "@")
                .replaceAll("e", "€")
                .replaceAll("l", "1")
                .replaceAll("o", "0");
    }
}
