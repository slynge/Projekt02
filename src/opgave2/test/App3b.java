package opgave2.test;

import java.util.Scanner;

public class App3b {
    public static void main(String[] args) {



    }

    public void UIMenu(){

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
