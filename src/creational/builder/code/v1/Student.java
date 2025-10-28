package creational.builder.code.v1;

public class Student {
    private String firstName;
    private String lastName;
    private int rollNo;
    private int age;
    private String school;

    Student(Hellper helper){
        this.firstName = helper.getFirstName();
        this.lastName = helper.getLastName();
        this.rollNo = helper.getRollNo();
        this.age = helper.getAge();
        this.school = helper.getSchool();

    }

}
