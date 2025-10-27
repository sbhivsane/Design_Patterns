package behaviour.observer;

public class Client {
    static void main() {


        CustomerSubscriber customerSubscriber = new CustomerSubscriber();
        LocalStoreSubscriber localStoreSubscriber = new LocalStoreSubscriber();

        EvolveMartPublisher.subscribeForIPhoneNotification(customerSubscriber);
        EvolveMartPublisher.subscribeForIPhoneNotification(localStoreSubscriber);
        EvolveMartPublisher.publishNotification();
        EvolveMartPublisher.unSubscribeForIPhoneNotification(customerSubscriber);
        EvolveMartPublisher.publishNotification();

    }
}
