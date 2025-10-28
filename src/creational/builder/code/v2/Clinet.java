package creational.builder.code.v2;

public class Clinet {

    static void main() {

        Student.Hellper builder = Student.getBuilder();
        builder.setFirstName("sagar");
       // creational.builder.setAge("20"); we can get the compile time check here this is one of advantage of creational.builder
        builder.setAge(20);
        Student student = new Student(builder);
        System.out.println(student);
    }
}
