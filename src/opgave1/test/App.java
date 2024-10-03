package opgave1.test;

import opgave1.model.Student;
import opgave1.model.Team;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Create students.
        Student martin = new Student("Martin");
        Student torben = new Student("Torben");
        Student emil = new Student("Emil");
        Student christian = new Student("Christian");
        Student bo = new Student("Bo");
        Student suzuki = new Student("Suzuki");

        // Create teams.
        Team team1 = new Team("Team1","Rum6000", new ArrayList<>());
        Team team2 = new Team("Team2","Rum808", new ArrayList<>());

        // Add students to team1.
        team1.addStudent(martin);
        team1.addStudent(emil);
        team1.addStudent(bo);

        // Add students to team2.
        team2.addStudent(christian);
        team2.addStudent(torben);
        team2.addStudent(suzuki);

        // Display the two teams.
        displayTeam(team1);
        displayTeam(team2);

        // Remove student from team1.
        team1.removeStudent(torben.getName());

        // Display team1 again to see effect.
        System.out.print("After removing torben ");
        displayTeam(team1);

        // Display the active students from team 1.
        displayActiveStudents(team1);
    }

    private static void displayTeam(Team team) {
        ArrayList<Student> students = team.getStudents();
        System.out.printf("%s has the following students (listed with name):\n", team.getName());

        for(Student student : students) {
            System.out.println(student.getName());
        }
        System.out.println();
    }

    private static void displayActiveStudents(Team team) {
        ArrayList<Student> activeStudents = team.getActiveStudents();
        System.out.printf("%s has the following active students (listed with name):\n", team.getName());

        for (Student activeStudent : activeStudents) {
            System.out.println(activeStudent.getName());
        }
    }
}
