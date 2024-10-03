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
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
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
            if (index == 0) {
                answers[index] = 'A';
            } else if(index == 1) {
                answers[index] = 'B';
            }
            else if(index == 2) {
                answers[index] = 'C';
            }
            else {
                answers[index] = 'D';
            }
        }
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
