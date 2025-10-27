package behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class EvolveMartPublisher {

   private static List<IphoneNotificationSubscriber> iphoneNotificationSubscribers = new ArrayList<>();

    public static void subscribeForIPhoneNotification(IphoneNotificationSubscriber subscriber){
        iphoneNotificationSubscribers.add(subscriber);
    }

    public static void unSubscribeForIPhoneNotification(IphoneNotificationSubscriber subscriber){
        iphoneNotificationSubscribers.remove(subscriber);
    }

    public static void publishNotification(){
        for (IphoneNotificationSubscriber sub : iphoneNotificationSubscribers){
            sub.sendNotification();
        }
    }

}
