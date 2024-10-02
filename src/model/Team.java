package model;

import java.util.ArrayList;

public class Team {
    private String name;
    private String room;
    private ArrayList<Student> students;

    public void addStudent(Student student) {
        students.add(student);
    }

    public Team(String name, String room, ArrayList<Student> students) {
        this.name = name;
        this.room = room;
        this.students = students;
    }

    public ArrayList<Student> getActiveStudents(ArrayList<Student> students) {

        ArrayList<Student> activeStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.isActive()) {
                activeStudents.add(student);
            }
        }
        return activeStudents;
    }

    public void removeStudent(String name) {
        for (Student student : students) {
            if(student.getName().equals(name)) {
                students.remove(student);

            }
        }
    }

}

