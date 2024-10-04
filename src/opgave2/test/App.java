package opgave2.test;

import opgave2.model.Student;
import opgave2.model.Team;
import opgave2.model.MultipleChoice;
import static opgave2.model.Print.*;

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
        displayHighestGradeForStudent(martin);

        // Display average grade for Martin.
        displayAverageGradeForStudent(martin);

        // Display the average grade for team1.
        displayAverageGradeForTeam(team1);

        // Display the high scoring students for team1.
        // We want them with an average grade over 7.
        displayHighScoreStudentsForTeam(team1, 7);

        // Since the constructor calls generateAnswer(), it's hard to test it.
        // We can, however, just get the grades.
        displayTheGradesOfStudent(martin);

        // Make an object of MultipleChoice, we will use this object
        // to print the quiz and also get the correct answers.
        MultipleChoice multipleChoice = new MultipleChoice();

        // Print the quiz.
        multipleChoice.printQuiz();

        // Get the correct answers.
        char[] correctAnswers = multipleChoice.getCorrectAnswers();

        // Now lets display the number of correct answers Martin had on his
        // multiple choice test.
        displayNumberOfCorrectAnswersForStudent(martin, correctAnswers);

        // Now lets display the number of correct answers for each student in a team.
        displayCorrectAnswersForTeam(team1, correctAnswers);

        // Let's display the student info now.
        displayStudentInfoForTeam(team1, correctAnswers);

        int[] correctAnswersOverall = team1.studentsCorrectAnswers(correctAnswers);

        int questionNumber = 1;
        for(int index : correctAnswersOverall) {
            System.out.println("Question " + questionNumber + ": " + index);
            questionNumber++;
        }
    }
}
