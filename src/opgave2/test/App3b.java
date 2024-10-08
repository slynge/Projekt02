package opgave2.test;

import opgave2.model.Student;
import opgave2.model.Team;
import opgave2.model.MultipleChoice;

import java.util.ArrayList;

import static opgave2.model.Print.displayStudentInfoForTeam;

public class App3b {

    public static void main(String[] args) {
        ArrayList<Team> teamList = new ArrayList<>();

        //Create multipleChoice test
        MultipleChoice multipleChoice = new MultipleChoice();
        char[] correctAnswers = multipleChoice.getCorrectAnswers();

        ConsoleLayout.greeting();
        ConsoleLayout.requestSystemStatus();
        int userSystemStatus = UserInput.integer();

        while (systemStatus(userSystemStatus)){
            ConsoleLayout.menuUI();

            // System requests user interaction
            ConsoleLayout.requestUserInteraction();
            int userMenuChoice = UserInput.integer();
            teamList = appUIMenuOutcome(userMenuChoice, teamList, correctAnswers);

            userSystemStatus = userMenuChoice;

        }
    }

    private static boolean systemStatus(int userInput){
        if(userInput == 0){
            return true;
        } else if(userInput == 7) {
            return false;
        } else {
            return true;
        }
    }

    private static ArrayList appUIMenuOutcome(int inputNumber, ArrayList<Team> teamList, char[] correctAnswers){

        switch (inputNumber){

            //Create Team
            case 1:
                System.out.print("Write team name: ");
                String teamName = UserInput.string();

                ConsoleLayout.whiteSpaceSeparator();

                System.out.print("Write team location: ");
                String location = UserInput.string();

                Team team = new Team(teamName,location,new ArrayList<Student>());

                teamList.add(team);
                break;

            //Create Student and add to team
            case 2:
                System.out.print("Name student's team: ");
                String studentTeam = UserInput.string();

                System.out.print("Student name: ");
                String studentName = UserInput.string();

                Student student = new Student(studentName);

                System.out.print("Is student active?: ");
                String isActive = UserInput.string();

                if(isActive.equals("yes") || isActive.equals("Yes")){
                    student.setActive(true);
                } else student.setActive(false);

                System.out.print("How many grades: ");
                int amountOfGrade = UserInput.integer();
                student.setGrades(amountOfGrade);

                for(Team specificTeam : teamList){
                    if(specificTeam.getName().equals(studentTeam)) specificTeam.addStudent(student);
                }
                break;

            //Remove Student from team
            case 3:
                System.out.print("Which student do you want to remove? ");
                String studentNameForRemoval = UserInput.string();
                for(Team specificTeam : teamList) specificTeam.removeStudent(studentNameForRemoval);

                break;


            //Show one student's info
            case 4:
                System.out.print("What student do you want to see info about: ");
                String studentCase3Name =  UserInput.string();

                for(Team specificTeam : teamList){
                    System.out.println(specificTeam.getStudentInfoByName(studentCase3Name, correctAnswers));
                }
                break;

            //Show one team's student info
            case 5:
                System.out.print("Team's name: ");
                teamName = UserInput.string();

                System.out.println("Statistic for team: " + teamName);
                team = getTeamByName(teamName, teamList);

                displayStudentInfoForTeam(team, correctAnswers);
                break;

            //Show all team's student info
            case 6:

                for(Team aTeam : teamList) {
                    System.out.println("Statistic for team: " + aTeam.getName());
                    team = getTeamByName(aTeam.getName(), teamList);
                    displayStudentInfoForTeam(team, correctAnswers);

                }

                break;

            //Exit program
            case 7:
                System.out.print("Exiting program...");
                break;

            default:
                System.out.println("That is not possible to do, you need to write a number between 1-6");
                break;
        }
        return teamList;
    }
    // helper method for case 5
    private static Team getTeamByName(String teamName, ArrayList<Team> teamList) {
        for (Team team : teamList) {
            if(team.getName().equals(teamName)) {
                return team;
            }
        }
        return null;
    }
}