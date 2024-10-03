package opgave2.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Team {
    private String name;
    private String room;
    private ArrayList<Student> students;

    public Team(String name, String room, ArrayList<Student> students) {
        setName(name);
        setRoom(room);
        setStudents(students);
    }

    public Student getStudent(int index) {
        return students.get(index);
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
        students.add(student);
    }

    public Student[] getActiveStudents() {

        ArrayList<Student> activeStudentsList = new ArrayList<>();

        for (Student student : students) {
            if (student.isActive()) {
                activeStudentsList.add(student);
            }
        }
        Student[] activeStudents = new Student[activeStudentsList.size()];
        return activeStudentsList.toArray(activeStudents);
    }

    public void removeStudent(String name) {
        for (int index = 0; index < students.size(); index++) {
            Student student = getStudent(index);
            if(student.getName().equals(name)) {
                students.remove(student);
            }
        }
    }

    // Method for average of all grades given

    public double getAverageGradeForStudents(){

        double sumOfEachAverageGrade = 0;
        int numberOfStudents = students.size();

        for(Student student : students){
            sumOfEachAverageGrade += student.averageGrade();
        }

        return sumOfEachAverageGrade / numberOfStudents;
    }



    /*
    Method for returning array with students of a certain average
    public Student[] highScoreStudents(double minAverage)
     */
    public Student[] highScoreStudents(double minAverage) {
        Student[] activeStudents = getActiveStudents();
        ArrayList<Student> activeStudentsList = new ArrayList<>(Arrays.asList(activeStudents));

        for (Student activeStudent : activeStudentsList) {
            double averageGradeForStudent = activeStudent.averageGrade();
            if(averageGradeForStudent < minAverage) {
                activeStudentsList.remove(activeStudent);
            }
        }

        Student[] activeHighScoreStudents = new Student[activeStudentsList.size()];
        return activeStudentsList.toArray(activeHighScoreStudents);

    }

    public String[] studentInfo(){

        Student[] students = getActiveStudents();
        String[] studentsInfo = new String[students.length];

        for(int index = 0; index < students.length; index++) studentsInfo[index] = (students[index].getName() + ", " + students[index].averageGrade() + ", " + "Rigitige svar");

        return studentsInfo;
    }

}

