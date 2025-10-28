package creational.factory.button;

public class AndroidButton implements Button{
    @Override
    public void click() {
        System.out.println("android button click");
    }
}
