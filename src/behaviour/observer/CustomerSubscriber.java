package behaviour.observer;

public class CustomerSubscriber implements IphoneNotificationSubscriber{
    @Override
    public void sendNotification() {
        System.out.println("Notification send to customer");
    }
}
