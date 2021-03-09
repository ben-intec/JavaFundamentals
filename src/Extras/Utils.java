package Extras;

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
