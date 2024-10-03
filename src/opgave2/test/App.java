package opgave2.test;

import opgave2.model.Student;
import opgave2.model.Team;
import opgave2.model.MultipleChoice;

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

        // Display the highest grade for Martin.
        System.out.printf("Martins highest grade is: %d\n", martin.getHighestGrade());

        // Display average grade for Martin.
        System.out.printf("Martins average grade is: %f.\n", martin.getAverageGrade());

        MultipleChoice multi = new MultipleChoice();

        multi.printQuiz();

        char[] correctAnswers = multi.correctAnswers();

        String[] studentInfo = team1.studentInfo(correctAnswers);

        for(String string : studentInfo) System.out.println(string);

        int[] correctAnswersOverall = team1.studentsCorrectAnswers(correctAnswers);

        int questionNumber = 1;
        for(int index : correctAnswersOverall) {
            System.out.println("Question " + questionNumber + ": " + index);
            questionNumber++;
        }
    }
}
