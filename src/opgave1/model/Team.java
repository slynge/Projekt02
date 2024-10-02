package opgave1.model;

import java.util.ArrayList;

public class Team {
    private String name;
    private String room;
    private ArrayList<Student> students;

    public Team(String name, String room, ArrayList<Student> students) {
        setName(name);
        setRoom(room);
        setStudents(students);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setRoom(String room) {
        this.room = room;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public ArrayList<Student> getStudentList (){
        return this.students;

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
        for (int index = 0; index < students.size(); index++) {
            if(students.get(index).getName().equals(name)) {
                students.remove(students.get(index));
            }
        }
    }

}

