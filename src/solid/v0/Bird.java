package solid.v0;

public class Bird {

    String name;
    String color;
    String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fly(String name){
        if(name.equals("crow")){
            System.out.println("crow is flying");
        }if(name.equals("sparrow")){
            System.out.println("sparrow is flying");
        }if(name.equals("eagly")){
            System.out.println("eagly is flying");
        }
    }
    public void eat (String name){

    }

    public void speak(String name){

    }
}
