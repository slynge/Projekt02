package opgave2.model;

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

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
