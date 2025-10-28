package structural.facade;

public class OnOrderPlaceFacade {

    public void OnOrderPlace(){

        DilevieryService dilevieryService = new DilevieryService();
        InventoryService inventoryService = new InventoryService();
        NotificationService notificationService = new NotificationService();
        dilevieryService.setDilevery();
        inventoryService.updateInventory();
        notificationService.sendNotification();
    }
}
