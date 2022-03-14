package oopTwo;

import java.util.HashMap;
import java.util.Scanner;

public class Student {

    private HashMap<Integer, String> studentInfo;

    public Student(HashMap<Integer, String> studentInfo) {
        this.studentInfo = studentInfo;
    }
    public void printStudentsNames() {
        for (HashMap.Entry singleStudent : studentInfo.entrySet()) {
            System.out.println("Student name: " + singleStudent.getValue());
        }
    }
    public void printOrdinalNumber() {
        for (HashMap.Entry singleStudent : studentInfo.entrySet()) {
            System.out.println("Ordinal number: " + singleStudent.getKey());
            }
        }
    public void addStudent () {
        Scanner reader = new Scanner(System.in);
        char answer;
        do {
            System.out.println("Do you want to add more students in list? ");
            answer = reader.next().charAt(0);
            if (answer == 'y' || answer == 'Y') {
                System.out.println("Please enter Ordinal number (Integer) and Student Name ");
                studentInfo.put(reader.nextInt(),reader.nextLine());
        } else
        break;
            } while (true);
        System.out.println(studentInfo);
    }
    public void replaceStudent () {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter the key number and New Student Name: ");
        studentInfo.replace(reader.nextInt(), reader.nextLine());
        System.out.println("Map after replacement of Student: "+ studentInfo);
    }
    public void removeStudent () {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter the Ordinal number of Student name which you want to remove ");
        studentInfo.remove(reader.nextInt());
        System.out.println("Map after removal of Student: " + studentInfo);
    }
    public HashMap<Integer, String> getStudentInfo() {
        return studentInfo;
    }
    public void setStudentInfo(HashMap<Integer, String> studentInfo) {
        this.studentInfo = studentInfo;
    }
}

//2. Napravite klasu Student koja u konstruktoru prima HashMap<Integer, String> studentInfo
//        gdje studentInfo hash mapa sadrzi redni broj (key) i name (value) svakog studenta koji je dat na inputu.
//        U klasi student treba da bude definisana mogucnost da:
//        - ispisemo imena svih studenata na outputu
//        - ispisemo redne brojeve svih studenata na outputu
//        - dodavati nove studente u hash mapu
//        - mijenjati postojece studente u hash mapi
//        - brisati postojece studente iz hash mape