package factory;

import factory.button.AndroidButton;
import factory.button.Button;

public class AndroidFactory implements FluterUiFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
