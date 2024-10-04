package opgave2.test;

import opgave2.model.Student;
import opgave2.model.Team;
import opgave2.model.MultipleChoice;

import java.util.ArrayList;
import java.util.Scanner;

public class App3b {

    public static void main(String[] args) {
        appLayout.greeting();
        appLayout.requestSystemStatus();
        int userSystemStatus = UserInput.integer();

        while (systemStatus(userSystemStatus)){
            appLayout.menuUI();

            // System requests user interaction
            appLayout.requestUserInteraction();
            int userMenuChoice = UserInput.integer();
            appUIMenuOutcome(userMenuChoice, new ArrayList<>());
        }
    }

    private static boolean systemStatus(int userInput){
        return (userInput == 0);
    }

    private static ArrayList appUIMenuOutcome(int inputNumber, ArrayList<Team> teamList){

        switch (inputNumber){

            case 1:
                System.out.print("Write team name: ");
                String teamName = UserInput.string();
                appLayout.whiteSpaceSeparator();
                System.out.print("Write team location: ");
                String location = UserInput.string();

                Team team = new Team(teamName,location,new ArrayList<Student>());

                teamList.add(team);

            case 2:
                System.out.print("Name student's team: ");
                String studentTeam = UserInput.string();
                System.out.print("Student name: ");
                String studentName = UserInput.string();
                Student student = new Student(studentName);
                System.out.print("Is student active?: ");
                String isActive = UserInput.string();
                if(isActive.equals("true")) student.setActive(true);
                else student.setActive(false);
                System.out.print("How many grades: ");
                int amountOfGrade = UserInput.integer();
                student.setGrades(amountOfGrade);

                for(Team specificTeam : teamList) if(specificTeam.getName().equals(studentTeam)) specificTeam.addStudent(student);
                break;


            case 3:

                System.out.print("What student you want to see info about");



                break;
            case 4:
            case 5:
            case 6:
            //case 7:

            default:

        }


        return teamList;
    }

}
