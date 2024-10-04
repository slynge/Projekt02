package opgave2.test;

import java.util.Scanner;

public class App3b {
    public static void main(String[] args) {

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
