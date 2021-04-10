package chapter9.game;

import java.util.ArrayList;
import java.util.Random;

public class HigherLowerGame {

    public interface OnGuessListener{
        void onGuessedToHigh();
        void onGuessedToLow();
        void onGuessedCorrect();
    }

    private final int max;
    private final Random random;
    private int value;
    private ArrayList<OnGuessListener> listeners;

    public HigherLowerGame(int max) {
        this.max = max;
        random = new Random();
        reset();
    }

    public void reset() {
        value = random.nextInt(max) + 1;
        System.out.println("VAL: " + value);
    }

    public void guess(int guessValue) {
        if(guessValue == value) onGuessedCorrect();
        else if(guessValue < value) onGuessedToLow();
        if(guessValue > value) onGuessedToHigh();
    }

    public void setListener(OnGuessListener listener) {
        if(this.listeners == null)
            this.listeners = new ArrayList<>();

        this.listeners.add(listener);
    }

    private void onGuessedToHigh(){
        if(this.listeners != null){
            for (OnGuessListener listener : this.listeners) {
                listener.onGuessedToHigh();
            }
        }
    }

    private void onGuessedToLow(){
        if(this.listeners != null){
            for (OnGuessListener listener : this.listeners) {
                listener.onGuessedToLow();
            }
        }
    }

    private void onGuessedCorrect(){
        if(this.listeners != null){
            for (OnGuessListener listener : this.listeners) {
                listener.onGuessedCorrect();
            }
        }
    }
}
