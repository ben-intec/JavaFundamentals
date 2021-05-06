package chapter12;

import java.time.Instant;

public class InstantsApp {

    public static void main(String[] args) {
        System.out.println(Instant.EPOCH);
        System.out.println(Instant.MIN);
        System.out.println(Instant.MAX);

        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());


        Instant earlier = now.minusSeconds(20);
        System.out.println(earlier);

        Instant later = now.plusSeconds(20);
        System.out.println(later);

        System.out.println(now.isAfter(earlier));
        System.out.println(now.isBefore(later));

        System.out.println(now.plusSeconds(7).plusMillis(5).plusNanos(3));
    }
}
