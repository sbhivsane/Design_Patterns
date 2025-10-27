package factory;

public class Client {
    static void main() {
        FulterUi fui = new FulterUi();
    fui.setTheam();
        FluterUiFactory ios = fui.getUiFactory("android");
        ios.createButton().click();
    }
}


