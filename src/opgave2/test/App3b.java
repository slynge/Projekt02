package opgave2.test;

import opgave2.model.Student;
import opgave2.model.Team;
import opgave2.model.MultipleChoice;

import java.util.ArrayList;
import java.util.Scanner;

import static opgave2.model.Print.displayStudentInfoForTeam;

public class App3b {

    public static void main(String[] args) {
        ArrayList<Team> teamList = new ArrayList<>();
        MultipleChoice multipleChoice = new MultipleChoice();
        char[] correctAnswers = multipleChoice.getCorrectAnswers();
        consoleLayout.greeting();
        consoleLayout.requestSystemStatus();
        int userSystemStatus = UserInput.integer();

        while (systemStatus(userSystemStatus)){
            consoleLayout.menuUI();

            // System requests user interaction
            consoleLayout.requestUserInteraction();
            int userMenuChoice = UserInput.integer();
            teamList = appUIMenuOutcome(userMenuChoice, teamList, correctAnswers);
        }
    }

    private static boolean systemStatus(int userInput){

        if(userInput == 0) return true;
        else if(userInput == 6) return false;
        else return true;

    }

    private static ArrayList appUIMenuOutcome(int inputNumber, ArrayList<Team> teamList, char[] correctAnswers){

        switch (inputNumber){

            case 1:
                System.out.print("Write team name: ");
                String teamName = UserInput.string();
                consoleLayout.whiteSpaceSeparator();
                System.out.print("Write team location: ");
                String location = UserInput.string();

                Team team = new Team(teamName,location,new ArrayList<Student>());

                teamList.add(team);
                break;

            case 2:
                System.out.print("Name student's team: ");
                String studentTeam = UserInput.string();
                System.out.print("Student name: ");
                String studentName = UserInput.string();
                Student student = new Student(studentName);
                System.out.print("Is student active?: ");
                String isActive = UserInput.string();
                if(isActive.equals("yes")) student.setActive(true);
                else student.setActive(false);
                System.out.print("How many grades: ");
                int amountOfGrade = UserInput.integer();
                student.setGrades(amountOfGrade);

                for(Team specificTeam : teamList) if(specificTeam.getName().equals(studentTeam)) specificTeam.addStudent(student);
                break;


            case 3:

                System.out.print("What student do you want to see info about: ");
                String studentCase3Name =  UserInput.string();

                for(Team specificTeam : teamList) System.out.println(specificTeam.getStudentInfoByName(studentCase3Name, correctAnswers));

                break;

            case 4:
                System.out.print("Team's name: ");
                teamName = UserInput.string();
                System.out.println("Statistic for team: " + teamName);
                team = getTeamByName(teamName, teamList);
                displayStudentInfoForTeam(team, correctAnswers);
                break;

            case 5:

                for(Team aTeam : teamList) {


                    System.out.println("Statistic for team: " + aTeam.getName());
                    team = getTeamByName(aTeam.getName(), teamList);
                    displayStudentInfoForTeam(team, correctAnswers);

                }

                break;

            case 6:
                System.out.print("--> Program finished.");
                break;

            //case 7:

            default:
                break;

        }


        return teamList;
    }

    private static Team getTeamByName(String teamName, ArrayList<Team> teamList) {
        for (Team team : teamList) {
            if(team.getName().equals(teamName)) {
                return team;
            }
        }
        return null;
    }
}
