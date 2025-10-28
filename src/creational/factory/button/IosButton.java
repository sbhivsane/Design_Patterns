package creational.factory.button;

public class IosButton implements Button{

    @Override
    public void click() {
        System.out.println("IOS Button Click");
    }
}
