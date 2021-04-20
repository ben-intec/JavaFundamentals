package chapter11;

public enum Coin {
    ONE_CENT(0.01f),
    TWO_CENT(0.02f),
    FIVE_CENT(0.05f),
    TEN_CENT(0.1f),
    TWENTY_CENT(0.2f),
    FIFTY_CENT(0.5f),
    ONE_EURO(1f),
    TWO_EURO(2f);
    
    public final float value;
    
    private Coin(float value) {
        this.value = value;
    }
}
