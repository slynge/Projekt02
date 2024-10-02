package opgave2.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Student {
    private String name;
    private boolean active;
    private int[] grades;

    public Student(String name) {
        setName(name);
        setActive(true);
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
    public void highestGrade (Student student){
        int[] studentGrades = student.getGrades();
        int highestGrade = 0;

        for(int index : studentGrades){
            if(highestGrade < index){
                highestGrade = index;
                System.out.println(highestGrade);
            }
        }

    }

    // Method for average
}
