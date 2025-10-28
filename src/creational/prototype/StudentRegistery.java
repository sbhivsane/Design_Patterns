package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistery {

    Map<String,Student> studentRegistery = new HashMap<>();

    public void registerStudent(String key , Student student){
        studentRegistery.put(key,student);
    }

    public Student getStudent(String key){
       return studentRegistery.get(key);
    }

}
