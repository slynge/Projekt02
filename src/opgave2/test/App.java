package opgave2.test;

import opgave1.model.Student;
import opgave1.model.Team;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Create students
        opgave1.model.Student martin = new opgave1.model.Student("Martin");
        opgave1.model.Student torben = new opgave1.model.Student("Torben");
        opgave1.model.Student emil = new opgave1.model.Student("Emil");
        opgave1.model.Student christian = new opgave1.model.Student("Christian");
        opgave1.model.Student bo = new opgave1.model.Student("Bo");
        opgave1.model.Student suzuki = new Student("Suzuki");

        Team team1 = new Team("Team1","Rum6000", new ArrayList<>());
        Team team2 = new Team("Team2","Rum808", new ArrayList<>());

        team1.addStudent(martin);
        team1.addStudent(emil);
        team1.addStudent(christian);

        team1.addStudent(torben);
        team1.removeStudent(torben.getName());

        team1.getActiveStudents();

        team2.addStudent(torben);
        team2.addStudent(bo);
        team2.addStudent(suzuki);


    }
}
