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
        displayHighestGradeForStudent(martin);

        // Display average grade for Martin.
        displayAverageGradeForStudent(martin);

        // Display the average grade for team1.
        displayAverageGradeForTeam(team1);

        // Display the high scoring students for team1.
        // We want them with an average grade over 7.
        displayHighScoreStudentsForTeam(team1, 7);


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

    private static void displayHighestGradeForStudent(Student student) {
        System.out.printf("%s's highest grade is: %d.\n", student.getName(), student.getHighestGrade());
    }

    private static void displayAverageGradeForStudent(Student student) {
        System.out.printf("%s's average grade is: %f.\n", student.getName(), student.getAverageGrade());
    }

    private static void displayAverageGradeForTeam(Team team1) {
        System.out.printf("%s's average grade is: %f.\n", team1.getName(), team1.getAverageGradeForTeam());
    }

    private static void displayHighScoreStudentsForTeam(Team team, double minAverage) {
        ArrayList<Student> highScoreStudents = team.getHighScoreStudents(minAverage);
        if(highScoreStudents.isEmpty()) {
            System.out.printf("%s has no high scoring students. \n", team.getName());
        }
        else {
            System.out.printf("%s has the following high scoring students (listed with name):\n", team.getName());
            for (Student highScoreStudent : highScoreStudents) {
                System.out.println(highScoreStudent.getName());
            }
        }
    }
}
