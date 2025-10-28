package creational.builder.code.v3;

public class Student {
    private String firstName;
    private String lastName;
    private int rollNo;
    private int age;
    private String school;

    public Student(StudentBuilder helper){
        this.firstName = helper.getFirstName();
        this.lastName = helper.getLastName();
        this.rollNo = helper.getRollNo();
        this.age = helper.getAge();
        this.school = helper.getSchool();

    }

    public static StudentBuilder getBuilder(){
       return new StudentBuilder();
    }


    public static class StudentBuilder {
        private String firstName;
        private String lastName;
        private int rollNo;
        private int age;
        private String school;

        public StudentBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getRollNo() {
            return rollNo;
        }

        public int getAge() {
            return age;
        }

        public String getSchool() {
            return school;
        }

        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder setRollNo(int rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setSchool(String school) {
            this.school = school;
            return this;
        }

        public Student build() {

            if(this.age>18)
                throw new RuntimeException("age of student is not valid ");
            return new Student(this);
        }
    }

}
