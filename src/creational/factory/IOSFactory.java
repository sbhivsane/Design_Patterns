package creational.factory;

import creational.factory.button.Button;
import creational.factory.button.IosButton;

public class IOSFactory implements FluterUiFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }
}
