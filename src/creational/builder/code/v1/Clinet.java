package creational.builder.code.v1;

public class Clinet {

    static void main() {
        Hellper hellper = new Hellper();
        hellper.setFirstName("sagar");
        hellper.setRollNo(1);

        Student student = new Student(hellper);
        System.out.println(student);
    }
}
