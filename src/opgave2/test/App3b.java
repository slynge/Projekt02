package opgave2.test;

import opgave2.model.Student;
import opgave2.model.Team;
import opgave2.model.MultipleChoice;

import java.util.Scanner;

public class App3b {

    private boolean systemStatus; // default false

    public static void main(String[] args) {
        greeting();
        requestUserInteraction();

        int userSystemStatus = intUserInput();;

        while (systemStatus(userSystemStatus)){
            menuUI();

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

    private static

    switch (inputNumber){
        case -3:
        case 0:
        case 2:
        case 4:
        case 7:
        case 10:
        case 12:
            return true;
        default:
            return false;
    }

}
