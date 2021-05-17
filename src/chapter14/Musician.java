package chapter14;

public class Musician {

    public void play() {
        Instrument drums = new Instrument() {
            @Override
            public void makeSound() {
                System.out.println("Badoom Tss");
            }
        };

        drums.makeSound();
    }

}
