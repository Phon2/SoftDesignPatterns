package Obser;

import java.util.ArrayList;
import java.util.List;

public class Student implements iStudent {
    private String name;
    private List<String> assignments;

    public Student(String name) {
        this.name = name;
        this.assignments = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<String> getAssignments(){
        return this.assignments;
    }


    @Override
    public void update(List<String> assignments_from_subject) {
        this.assignments = List.copyOf(assignments_from_subject);
    }
}
