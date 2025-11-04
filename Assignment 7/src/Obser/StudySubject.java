package Obser;

import java.util.ArrayList;
import java.util.List;

public class StudySubject implements iSubject {

    private final String subjectName;
    private List<iStudent> students;
    private List<String> assignments;

    public StudySubject(String name) {
        this.subjectName = name;
        this.assignments = new ArrayList<String>();
        this.students = new ArrayList<iStudent>();
    }

    String getSubjectName() {
        return subjectName;
    }

    public void setAssignments(List<String> assignments) {
        this.assignments = assignments;
    }

    public void addAssignment(String assignment){
        this.assignments.add(assignment);
    }

    public void removeAssignment(String assignment){
        this.assignments.remove(assignment);
    }


    @Override
    public void addStudent(iStudent s) {
        this.students.add(s);
        s.update(this.assignments);
    }

    @Override
    public void removeStudent(iStudent s) {
        this.students.remove(s);
    }

    @Override
    public void notifyStudents() {
        for(iStudent s: this.students){
            s.update(this.assignments);
        }
    }
}
