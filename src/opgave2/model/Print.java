package opgave2.model;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Print {
    public static void displayHighestGradeForStudent(Student student) {
        System.out.printf("%s's highest grade is: %d.\n", student.getName(), student.getHighestGrade());
        System.out.println();
    }

    public static void displayAverageGradeForStudent(Student student) {
        System.out.printf("%s's average grade is: %f.\n", student.getName(), student.getAverageGrade());
        System.out.println();
    }

    public static void displayAverageGradeForTeam(Team team1) {
        System.out.printf("%s's average grade is: %f.\n", team1.getName(), team1.getAverageGradeForTeam());
        System.out.println();
    }

    public static void displayHighScoreStudentsForTeam(Team team, double minAverage) {
        ArrayList<Student> highScoreStudents = team.getHighScoreStudents(minAverage);
        if(highScoreStudents.isEmpty()) {
            System.out.printf("%s has no high scoring students.\n", team.getName());
        }
        else {
            System.out.printf("%s has the following high scoring students (listed with name):\n", team.getName());
            for (Student highScoreStudent : highScoreStudents) {
                System.out.println(highScoreStudent.getName());
            }
        }
        System.out.println();
    }

    public static void displayTheGradesOfStudent(Student student) {
        int[] grades = student.getGrades();
        System.out.printf("%s has the following grades (listed in an array)\n", student.getName());
        System.out.print("[");
        for (int index = 0; index < grades.length; index++) {
            int grade = grades[index];
            if(index == 0) {
                System.out.print(grade);
            }
            else {
                System.out.print(", " + grade);
            }
        }
        System.out.println("].");
        System.out.println();
    }

    public static void displayNumberOfCorrectAnswersForStudent(Student student, char[] correctAnswers) {
        System.out.printf("%s's number of correct answers on the test is: %d.\n", student.getName(), student.getNumberOfCorrectAnswers(correctAnswers));
        System.out.println();
    }

    public static void displayCorrectAnswersForTeam(Team team, char[] correctAnswers) {
        ArrayList<Integer> correctAnswersForTeam = team.getCorrectAnswersForTeam(correctAnswers);
        System.out.printf("%s has the students with the correct answers (listed in an array with number of correct answers)\n", team.getName());
        System.out.print("[");
        for (int index = 0; index < correctAnswersForTeam.size(); index++) {
            int numberOfCorrectAnswers = correctAnswersForTeam.get(index);
            if(index == 0) {
                System.out.print(numberOfCorrectAnswers);
            }
            else {
                System.out.print(", " + numberOfCorrectAnswers);
            }
        }
        System.out.println("].");
        System.out.println();
    }

    public static void displayStudentInfoForTeam(Team team, char[] correctAnswers) {
        ArrayList<String> studentInfo = team.getStudentInfo(correctAnswers);

        System.out.printf("%s has the following students with info (name, average grade, number of correct answers on test):\n", team.getName());
        for(String info : studentInfo) {
            System.out.println(info);
        }
        System.out.println();
    }

    public static void displayATeamsNumberOfCorrectAnswersForEachQuestion(Team team, char[] correctAnswers) {
        int[] correctAnswersOverall = team.getNumberOfCorrectAnswersForEachQuestion(correctAnswers);

        System.out.printf("%s has the following number of correct answers (listed by each question.)\n", team.getName());
        int questionNumber = 1;
        for(int numberOfCorrectAnswerOnQuestion : correctAnswersOverall) {
            System.out.println("Question " + questionNumber + ": " + numberOfCorrectAnswerOnQuestion);
            questionNumber++;
        }
    }
}
