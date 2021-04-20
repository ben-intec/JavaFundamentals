package chapter11;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class EnumApp {
    
    public static void main(String[] args) {
        //COLORS
        for (Color color : Color.values()) {
            System.out.println(color);
        }
        System.out.println();
        
        //DAYS
        for (Day day : Day.values()) {
            System.out.println(day.ordinal() + " " + day.toString());
        }
        System.out.println();
    
        //COINS
        Random random = ThreadLocalRandom.current();
        int bound = Coin.values().length;
        Coin[] coins = new Coin[25];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = Coin.values()[random.nextInt(bound)];
        }
         float money = 0;
    
        for (Coin coin : coins) {
            money += coin.value;
        }
        
        money = Math.round(money * 100) / 100f;
        
        System.out.println(money +" EUR in the pocket");
        System.out.println();

        //PLANETS
        for (Planet planet : Planet.values()) {
            System.out.println(planet);
        }
        
    }
    
}
