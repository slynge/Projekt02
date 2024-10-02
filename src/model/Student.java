package model;

public class Student {
    private String name;
    private boolean active;
    private int[] grades;

    public Student(String name) {
        setName(name);
        setActive(true);
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }
    public boolean isActive() {
        return active;
    }


}
