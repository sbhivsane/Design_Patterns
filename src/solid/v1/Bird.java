package solid.v1;

public abstract class Bird {

    String name;
    String color;
    String type;

    abstract public void setName(String name);
    abstract public void fly(String name);
    abstract public void eat (String name);
}
