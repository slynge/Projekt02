package opgave2.test;

import opgave2.model.Student;
import opgave2.model.Team;
import opgave2.model.MultipleChoice;

import java.util.ArrayList;
import java.util.Scanner;
import opgave2.model.Team;
import opgave2.model.Student;
import opgave2.model.MultipleChoice;

public class App3b {

    public static void main(String[] args) {
        appLayout.greeting();
        appLayout.requestUserInteraction();
        int userSystemStatus = intUserInput();;

        while (systemStatus(userSystemStatus)){
            appLayout.menuUI();

            // System requests user interaction
            appLayout.requestUserInteraction();
            userSystemStatus = intUserInput();
        }
    }

    private static boolean systemStatus(int userInput){
        return (userInput == 0);
    }

    private static int intUserInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static String stringUserInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static ArrayList appUIMenuOutcome(int inputNumber, ArrayList<Team> teamList){

        switch (inputNumber){

            case 1:
                System.out.print("Write team name");
                String teamName = stringUserInput();
                System.out.println();
                System.out.print("Write team location");
                String location = stringUserInput();

                Team team = new Team(teamName,location,new ArrayList<Student>());

                teamList.add(team);
                break;




            case 2:
                System.out.println("Name student's team: ");
                String studentTeam = stringUserInput();
                System.out.println("Student name");
                String studentName = stringUserInput();
                Student student = new Student(studentName);
                System.out.println("Is student active");
                String isActive = stringUserInput();
                if(isActive.equals("true")) student.setActive(true);
                else student.setActive(false);
                System.out.println("how many grades: ");
                int amountOfGrade = intUserInput();
                student.setGrades(amountOfGrade);

                for(Team specificTeam : teamList) if(specificTeam.getName().equals(studentTeam)) specificTeam.addStudent(student);


            case 3:
            case 4:
            case 5:
            case 6:

            //case 7:

            default:

        }


        return teamList;
    }

}
