package solid.v0;

public class Client  {
    static void main() {
        Bird crow = new Bird();
        crow.setName("crow");

        crow.fly("crow");

        Bird sparrow = new Bird();
        sparrow.setName("sparrow");

        sparrow.fly("sparrow");
    }
}
