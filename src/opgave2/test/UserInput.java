package opgave2.test;

import java.util.Scanner;

public class UserInput {
    public static int integer(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static String string(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
