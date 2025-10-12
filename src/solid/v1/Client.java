package solid.v1;

public class Client  {
    static void main() {
        Bird crow = new Crow();
        crow.setName("crow");

        crow.fly("crow");

        Bird sparrow = new Sparrow();
        sparrow.setName("sparrow");

        sparrow.fly("sparrow");
    }
}
