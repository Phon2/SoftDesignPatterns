import Obser.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Student> allStudents = new ArrayList<>();

        Student StudentAli = new Student("Ali");
        Student StudentBob = new Student("Bob");
        Student StudentClaire = new Student("Claire");
        Student StudentHeather = new Student("Heather");

        allStudents.add(StudentAli);
        allStudents.add(StudentBob);
        allStudents.add(StudentClaire);
        allStudents.add(StudentHeather);

        StudySubject CompScience = new StudySubject("CompScience");

        List<String> StartingAssignments = new ArrayList<String>();
        StartingAssignments.add("Assignment1");
        StartingAssignments.add("Assignment2");
        StartingAssignments.add("Assignment3");

        CompScience.setAssignments(StartingAssignments);
        CompScience.addStudent(StudentAli);
        CompScience.addStudent(StudentBob);
        CompScience.addStudent(StudentClaire);
        CompScience.addStudent(StudentHeather);

        for (Student student : allStudents) {
            System.out.println(student.getName() + " has assignments: ");
            for (String string : student.getAssignments()) {
                System.out.print(string + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------------------------------------------------");

        CompScience.removeStudent(StudentAli);
        CompScience.addAssignment("Assignment 4");
        CompScience.addAssignment("Assignment 5");
        CompScience.addAssignment("Assignment 6");
        CompScience.addAssignment("Assignment 7");
        CompScience.notifyStudents();


        for (Student student : allStudents) {
            System.out.println(student.getName() + " has assignments: ");
            for (String string : student.getAssignments()) {
                System.out.print(string + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------------------------------------------------");




    }
}