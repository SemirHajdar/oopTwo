package oopTwo;

import java.util.HashMap;

public class RunnerForStudent {
    public static void main(String[] args) {
        HashMap<Integer,String> studentMap = new HashMap<>();
        studentMap.put(1,"Amir");
        studentMap.put(2,"Damir");
        studentMap.put(3,"Mujo");
        studentMap.put(4,"Suljo");
        Student myStudent = new Student(studentMap);

        // use this Runner to manipulate with Student Class



    }
}
