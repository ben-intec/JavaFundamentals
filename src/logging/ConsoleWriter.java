package logging;

public class ConsoleWriter implements LogWriter{

    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
