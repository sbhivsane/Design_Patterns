package factory;

import factory.button.Button;

public class FulterUi {

    public void setTheam(){
        System.out.println("setting the theam");
    }
    // create button :
        //1 android
        //2 ios

    public FluterUiFactory getUiFactory(String platform){
        if(platform.equals("android"))
            return new AndroidFactory();
        if(platform.equals("ios"))
            return new IOSFactory();
        return null;
    }



}
