import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Utils {


    public static void pause(int ms) {
        try {

            TimeUnit.MILLISECONDS.sleep(ms);

        } catch(InterruptedException e) {

            System.err.format("IOException: %s%n", e);

        }
    }

}
