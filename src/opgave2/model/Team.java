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

    public String getName() {
        return name;
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

    public ArrayList<Student> getActiveStudents() {
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
            Student student = getStudent(index);
            if(student.getName().equals(name)) {
                students.remove(student);
            }
        }
    }

    // 2.3
    public double getAverageGradeForTeam(){
        int numberOfStudents = students.size();
        double sumOfAverageGrades = sumAverageGrades(students);
        return sumOfAverageGrades / numberOfStudents;
    }

    // 2.4
    public ArrayList<Student> getHighScoreStudents(double minAverage) {
        ArrayList<Student> activeStudents = getActiveStudents();
        ArrayList<Student> highScoreStudents = new ArrayList<>();

        for (Student activeStudent : activeStudents) {
            double averageGradeForStudent = activeStudent.getAverageGrade();
            if (averageGradeForStudent < minAverage) {
                highScoreStudents.add(activeStudent);
            }
        }
        return highScoreStudents;
    }

    public int[] getArrayOfCorrectAnswers(char[] correctAnswersArray) {
        int[] arrayCorrectAnswers = new int[students.size()];

        for(int index = 0; index < students.size(); index++) {
            Student student = getStudent(index);
            int correctAnswers = student.correctAnswers(correctAnswersArray);
            arrayCorrectAnswers[index] = correctAnswers;
        }

        return arrayCorrectAnswers;
    }

    public String[] studentInfo(char[] correctAnswers){

        ArrayList<Student> activeStudents = getActiveStudents();
        String[] studentsInfo = new String[activeStudents.size()];

        for(int index = 0; index < activeStudents.size(); index++) {
            Student student = getStudent(index);
            studentsInfo[index] = (student.getName() + ", " + student.getAverageGrade()  + ", " + student.correctAnswers(correctAnswers));
        }
        return studentsInfo;
    }


    public int[] studentsCorrectAnswers(char[] correctAnswers){

        int[] studentsCorrectAnswersAmount = new int[10];

        for(int outerIndex = 0; outerIndex < this.students.size(); outerIndex++){

            char[] studentAnswers = this.students.get(outerIndex).getAnswers();

            for(int innerIndex = 0; innerIndex < correctAnswers.length; innerIndex++){

                if(correctAnswers[innerIndex] == studentAnswers[innerIndex]) studentsCorrectAnswersAmount[innerIndex]++;

            }

        }


        return studentsCorrectAnswersAmount;
    }

    // helper function for 2.3
    private double sumAverageGrades(ArrayList<Student> students) {
        double sumOfAverageGrade = 0;
        for(Student student : students){
            sumOfAverageGrade += student.getAverageGrade();
        }
        return sumOfAverageGrade;
    }


}

