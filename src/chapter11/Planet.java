package chapter11;

import java.math.BigInteger;
import java.text.DecimalFormat;

public enum Planet {
    MERCURY(57_900_000, new BigInteger("330000000000000000000000")),
    VENUS(108_200_000, new BigInteger("4870000000000000000000000")),
    EARTH(149_600_000, new BigInteger("5980000000000000000000000")),
    MARS(227_900_000, new BigInteger("642000000000000000000000")),
    JUPITER(778_300_000, new BigInteger("1900000000000000000000000000")),
    SATURN(1_427_000_000, new BigInteger("569000000000000000000000000")),
    URANUS(2_871_000_000L, new BigInteger("86800000000000000000000000")),
    NEPTUNE(4_497_100_000L, new BigInteger("102000000000000000000000000"));
    
    public final long distance;
    public final BigInteger mass;
    
    Planet(long distance, BigInteger mass) {
        this.distance = distance;
        this.mass = mass;
    }
    
    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.##E0");
        return name().charAt(0) + name().substring(1).toLowerCase() +
                       "is the " + ordinalNo(ordinal() +1) + " planet from the sun "+
                       "at a distance of " + distance +
                       " km, and with a mass of " + format.format(mass) + " kg.";
    }
    
    private String ordinalNo(int value) {
        String suffix;
        switch (value) {
            case 1:
                suffix = "st";
            case 2:
                suffix = "nd";
            case 3:
                suffix = "rd";
            default:
                suffix = "th";
        }
        return value+suffix;
    }
}
