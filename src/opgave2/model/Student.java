package opgave2.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Student {
    private String name;
    private boolean active;
    private char[] answers = new char[10];
    private int[] grades;

    public Student(String name) {
        setName(name);
        setActive(true);
        generateAnswers();
        setGrades();
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(){

        grades = new int[(int)(Math.random()*10) + 1];

        for (int index = 0; index < grades.length; index++){

            int grade = (int)(Math.random()*7)+1;

            if(grade == 1) grade = -3;
            if(grade == 2) grade = 0;
            if(grade == 3) grade = 2;
            if(grade == 4) grade = 4;
            if(grade == 5) grade = 7;
            if(grade == 6) grade = 10;
            if(grade == 7) grade = 12;

            this.grades[index] = grade;
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

    // Method for highest grade given to student - use java.util.Collections .max()
    public int highestGrade (){
        int highestGrade = grades[0];

        for(int grade : grades){
            if(highestGrade < grade){
                highestGrade = grade;
            }
        }
        return highestGrade;
    }

    public void generateAnswers() {
        Random generator = new Random();
        for (int index = 0; index < answers.length; index++) {
            int integerValue = generator.nextInt(4);
            if (integerValue == 0) {
                answers[index] = 'A';
            } else if(integerValue == 1) {
                answers[index] = 'B';
            }
            else if(integerValue == 2) {
                answers[index] = 'C';
            }
            else {
                answers[index] = 'D';
            }
        }
    }

    public int correctAnswers(char[] correct) {
        int numberOfCorrectAnswers = 0;
        for(int index = 0; index < correct.length; index++) {
            if(correct[index] == answers[index]) {
                numberOfCorrectAnswers++;
            }
        }
        return numberOfCorrectAnswers;
    }

    // Method for average

    public double averageGrade() {
        int numberOfGrades = grades.length;
        int sumOfGrades = sum(grades);
        return (double) sumOfGrades /numberOfGrades;
    }

    private int sum(int[] grades) {
        int sumOfGrades = 0;
        for (int grade : grades) {
            sumOfGrades += grade;
        }
        return sumOfGrades;
    }
}
