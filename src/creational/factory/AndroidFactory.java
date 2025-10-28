package creational.factory;

import creational.factory.button.AndroidButton;
import creational.factory.button.Button;

public class AndroidFactory implements FluterUiFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
