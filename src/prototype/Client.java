package prototype;

public class Client {

    private static StudentRegistery fillRegistery(){
        StudentRegistery studentRegistery = new StudentRegistery();
        Student studentProtoType = new Student();
        studentProtoType.setBatch("MAR2023");
        studentProtoType.setAvgBatchPsp(87.7);
        studentRegistery.registerStudent("MAR2023",studentProtoType);
        IntelligentStudent intelligentStudentProtoType = new IntelligentStudent();
        intelligentStudentProtoType.setBatch("MAR2023IS");
        intelligentStudentProtoType.setAvgBatchPsp(97.7);
        intelligentStudentProtoType.setIq(323);
        studentRegistery.registerStudent("MAR2023IS",intelligentStudentProtoType);
        return studentRegistery;
    }


    static void main() {
        StudentRegistery studentRegistery=  fillRegistery();

        Student sagar = studentRegistery.getStudent("MAR2023").clone();
        sagar.setName("sagar");
        sagar.setPsp(67.6);
        System.out.println("DEBUG");



        Student roman = studentRegistery.getStudent("MAR2023IS").clone();
        roman.setName("roman");
        roman.setPsp(95.67);

        System.out.println("DEBUG");
    }
}
