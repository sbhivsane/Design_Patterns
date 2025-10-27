package behaviour.observer;

public class LocalStoreSubscriber implements IphoneNotificationSubscriber{
    @Override
    public void sendNotification() {
        System.out.println("Notification send to local store");
    }
}
