package chapter7;

//Arrays
//Opdracht 1

public class UsingArrays {
    public static void main(String[] args) {
//        opdracht1ac();

    }
    
    public static void opdracht1ac() {
        var ints = new int[20];
        for (int i = 0; i < 20; ) {
            ints[i] = ++i * 7;
        }

        System.out.println("\nforeach");
        for (int i : ints) {
            System.out.printf("%d, ",i);
        }

        System.out.println("\n\nreversed");
        for (int i = ints.length; i > 0; ) {
            System.out.printf("%d, ",ints[--i]);
        }
    }

    public static void opdracht1d() {
        boolean[] bools ={ true, false, true, false, true, true, false, true, true, false, false, true, false };

        for(var b : bools) {
            System.out.println(b);
        }
    }

    //opdracht 1 optioneel 1
    public static int[] getPrimesInArray(int range) {

        if (range < 1) return new int[] { 0 };

        int[] primes = new int[getPrimesCountGuess(range)];
        int index = 0;
        for (int i = 0; i < range && index < primes.length; i++) {
            if(isPrime(i)) {
                primes[index++] = i;
            }
        }
        return primes;

        //return IntStream.range(0, range).filter(i -> isPrime(i)).toArray();
    }

    public static int getPrimesCountGuess(int range) {
        char[] chars = Integer.toString(range).toCharArray();
        return range / ((chars.length -1) *2);
    }

    public static boolean isPrime(int number) {

        for (int i = 2; i < number/2; i++) {     //no factors > number/2 && < number exist
//            if (isPrime(i) && number % i == 0)  //Opdracht 1 optioneel 2
            if (number % i == 0)
                return false;
        }
        return number > 1;
    }
}
