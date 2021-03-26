package chapter7;

//Opdracht 5
public class Statistics {
    public static double average(int... values) {
        if (values == null || values.length == 0)
            return -1;

//        return Arrays.stream(values).average().getAsDouble();
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum /((double) values.length);
    }

    public static int min(int... values) {
        int min = Integer.MAX_VALUE;

        if (values != null && values.length > 0) {
            for (int value : values) {
                min = Math.min(min,value);
            }
        }

        return min;
    }

    public static int max(int... values) {
        int max = Integer.MIN_VALUE;

        if (values != null && values.length > 0) {
            for (int value : values) {
                max = Math.max(max,value);
            }
        }

        return max;
    }
}
