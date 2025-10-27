package factory;

import factory.button.Button;
import factory.button.IosButton;

public class IOSFactory implements FluterUiFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }
}
