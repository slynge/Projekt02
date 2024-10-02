package opgave1.test;

import opgave1.model.Student;
import opgave1.model.Team;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Create students
        Student martin = new Student("Martin");
        Student torben = new Student("Torben");
        Student emil = new Student("Emil");
        Student christian = new Student("Christian");
        Student bo = new Student("Bo");
        Student suzuki = new Student("Suzuki");

        Team team1 = new Team("Team1","Rum6000", new ArrayList<>());
        Team team2 = new Team("Team2","Rum808", new ArrayList<>());

        team1.addStudent(martin);
        team1.addStudent(emil);
        team1.addStudent(christian);

        team1.addStudent(torben);
        team1.removeStudent(torben.getName());

        team1.getActiveStudents(team1.getStudentList());

        team2.addStudent(torben);
        team2.addStudent(bo);
        team2.addStudent(suzuki);


    }
}
