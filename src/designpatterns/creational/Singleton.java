package designpatterns.creational;

public class Singleton {

    private Singleton() {
    }

    private static class Instance {
        private static final Singleton GET = new Singleton();
    }


    public static Singleton getInstance() {
        return Instance.GET;
    }
}
