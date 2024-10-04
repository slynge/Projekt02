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

    private boolean systemStatus; // default false

    public static void main(String[] args) {
        greeting();
        requestUserInteraction();

        int userSystemStatus = intUserInput();;

        while (systemStatus(userSystemStatus)){


            // System requests user interaction
            requestUserInteraction();
            userSystemStatus = intUserInput();
        }


    }

    private static void greeting(){
        System.out.println("===========================================");
        System.out.println("Welcome to a educational management system");
        System.out.println("===========================================");
    }
    private static void requestUserInteraction(){
        System.out.print("Press 0 to start system: ");
    }
    private static boolean systemStatus(int userInput){
        return (userInput == 0);
    }

    private static void menuUI(){
        System.out.println("1: Create a team");
        System.out.println("2: Create a student");
        System.out.println("3: Show one student's info and results");
        System.out.println("4: Show one  team's info and results");
        System.out.println("5: Show info and results for all teams");
        System.out.println("6: Exit program");
    }

    private static int intUserInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static String stringUserInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static Team createTeam (){

        System.out.print("Write team name");
        String name = stringUserInput();
        System.out.println();
        System.out.print("Write team location");
        String location = stringUserInput();

        Team team = new Team(name,location,new ArrayList<Student>());


        return team;
    }

    private static Team AppUIMenuOutcome(int inputNumber){

        switch (inputNumber){
            case 2:
                System.out.println("Name student's team: ");
                String studentTeam = stringUserInput();
                System.out.println("Is student active");
                String isActive = stringUserInput();
                if(isActive.equals("true")) 



            case 3:
            case 4:
            case 5:
            case 6:
            //case 7:

            default:

        }



    }

}
