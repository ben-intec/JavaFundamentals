package designpatterns;

import designpatterns.behavioural.observer.*;

public class Main {
    public static void main(String[] args) {
        Event event = new ConcreteEvent(EventCategory.DEFCON_FIVE, "Defcon Five event!!!");

        EventBus bus = new EventBus();

        EventListener listener = new ConcreteEventListener();
        EventListener listener1 = new ConcreteEventListener();
        EventListener listener2 = new ConcreteEventListener();

        bus.addEventListener(listener);
        bus.addEventListener(listener1);
        bus.addEventListener(listener2);
        bus.removeEventListener(listener);

        bus.publishEvent(event);

    }
}
