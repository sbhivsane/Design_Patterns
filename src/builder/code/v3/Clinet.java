package builder.code.v3;

public class Clinet {

    static void main() {

        // method chaning
        Student student = Student.getBuilder()
                .setFirstName("sagar")
                .setAge(17)
                .build();
        System.out.println(student);
    }
}
