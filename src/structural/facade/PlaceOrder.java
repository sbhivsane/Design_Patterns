package structural.facade;

public class PlaceOrder {


    // send notification
    // set delivery
    // update inventory



    static void main() {


        // on order place we will have lot of classes and object to deal with but
        // we can move this to separate class which will deal with just only things related to place order

        DilevieryService dilevieryService = new DilevieryService();
        InventoryService inventoryService = new InventoryService();
        NotificationService notificationService = new NotificationService();
        dilevieryService.setDilevery();
        inventoryService.updateInventory();
        notificationService.sendNotification();


        // like we can use facade DP here,all the complexity of orderPlace will be hidden behind that facade class

        OnOrderPlaceFacade onOrderPlaceFacade = new OnOrderPlaceFacade();
        onOrderPlaceFacade.OnOrderPlace();


    }
}
