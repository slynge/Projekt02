package opgave2.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Student {
    private String name;
    private boolean active;
    private char[] answers;
    private int[] grades;

    public Student(String name) {
        setName(name);
        setActive(true);
        generateAnswers();
        setGrades(-1);
    }

    public Student(String name, int setGrades_){
        setName(name);
        setActive(true);
        generateAnswers();
        setGrades(setGrades_);

    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public char[] getAnswers(){
        return answers;
    }

    public void setGrades(int gradeSize){

        if(gradeSize == -1) grades = new int[(int)(Math.random()*10) + 1];

        else grades = new int[gradeSize];

        int[] gradeConversions = {-3, 0, 2, 4, 7, 10, 12};

        for (int index = 0; index < grades.length; index++){
            int randomGrade = (int) (Math.random() * 7);
            grades[index] = gradeConversions[randomGrade];
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // 2.1
    public int getHighestGrade (){
        int highestGrade = grades[0];

        for(int grade : grades){
            if(highestGrade < grade){
                highestGrade = grade;
            }
        }
        return highestGrade;
    }

    // 2.2
    public double getAverageGrade() {
        int numberOfGrades = grades.length;
        double sumOfGrades = sum(grades);
        return sumOfGrades / numberOfGrades;
    }

    // 2.5
    public void generateAnswers() {
        Random generator = new Random();
        answers = new char[10];
        char[] choices = {'A', 'B', 'C', 'D'};

        for (int index = 0; index < answers.length; index++) {
            int integerValue= generator.nextInt(4);
            answers[index] = choices[integerValue];
        }
    }

    public int getNumberOfCorrectAnswers(char[] correct) {
        int numberOfCorrectAnswers = 0;
        for(int index = 0; index < correct.length; index++) {
            if(correct[index] == answers[index]) {
                numberOfCorrectAnswers++;
            }
        }
        return numberOfCorrectAnswers;
    }

    // helper function for 2.2
    private int sum(int[] grades) {
        int sumOfGrades = 0;
        for (int grade : grades) {
            sumOfGrades += grade;
        }
        return sumOfGrades;
    }
}
