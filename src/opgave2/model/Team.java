package opgave2.model;

import java.lang.reflect.Array;
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

    public String getStudentInfoByName(String studentName, char[] correctAnswers){

        for(Student neededStudent : this.students) {

            if(neededStudent.getName().equals(studentName)){
                String info = neededStudent.getName() + ", " + neededStudent.getAverageGrade()  + ", " + neededStudent.getNumberOfCorrectAnswers(correctAnswers);
                return info;
            }
        }
        return "Something went wrong";
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

    // 2.7
    public ArrayList<Integer> getCorrectAnswersForTeam(char[] correctAnswers) {
        ArrayList<Student> activeStudents = getActiveStudents();
        ArrayList<Integer> correctAnswersForTeam = new ArrayList<>();

        for(Student activeStudent : activeStudents) {
            int correctAnswersForStudent = activeStudent.getNumberOfCorrectAnswers(correctAnswers);
            correctAnswersForTeam.add(correctAnswersForStudent);
        }
        return correctAnswersForTeam;
    }

    // 2.8
    public ArrayList<String> getStudentInfo(char[] correctAnswers){

        ArrayList<Student> activeStudents = getActiveStudents();
        ArrayList<String> studentsInfo = new ArrayList<>();

        for(Student activeStudent : activeStudents) {
            String info = "Navn: " + activeStudent.getName() + "\t Gennemsnit:  " + activeStudent.getAverageGrade()  + "\t Antal rigtige: " + activeStudent.getNumberOfCorrectAnswers(correctAnswers);
            studentsInfo.add(info);
        }

        return studentsInfo;
    }


    // 2.9
    public int[] getNumberOfCorrectAnswersForEachQuestion(char[] correctAnswers){

        int[] studentsCorrectAnswersAmount = new int[10];

        for(int outerIndex = 0; outerIndex < this.students.size(); outerIndex++){

            char[] studentAnswers = this.students.get(outerIndex).getAnswers();

            for(int innerIndex = 0; innerIndex < correctAnswers.length; innerIndex++){

                if(correctAnswers[innerIndex] == studentAnswers[innerIndex]) studentsCorrectAnswersAmount[innerIndex]++;

            }
        }

        return studentsCorrectAnswersAmount;
    }

    // helper method for 2.3
    private double sumAverageGrades(ArrayList<Student> students) {
        double sumOfAverageGrade = 0;
        for(Student student : students){
            sumOfAverageGrade += student.getAverageGrade();
        }
        return sumOfAverageGrade;
    }
}