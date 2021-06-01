package designpatterns.behavioural.observer;

public interface Event {
    boolean isCategory(EventCategory category);
    Object getInformation();
    void setInformation(Object info);
}
