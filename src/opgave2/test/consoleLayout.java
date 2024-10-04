package opgave2.test;

public class consoleLayout {

    public static void greeting() {
        lineSeparator();
        System.out.println("Welcome to a educational management system");
        lineSeparator();
    }

    public static void lineSeparator() {
        System.out.println("===========================================");
    }
    public static void whiteSpaceSeparator(){
        System.out.println();
    }

    public static void requestSystemStatus() {
        System.out.print("Press 0 to start system: ");
    }
    public static void requestUserInteraction(){
        System.out.print("Choose a menu section: ");
    }

    public static void menuUI(){
        consoleLayout.lineSeparator();
        System.out.println("Menu:");
        System.out.println("1: Create a team");
        System.out.println("2: Create a student");
        System.out.println("3: Show one student's info and results");
        System.out.println("4: Show one  team's info and results");
        System.out.println("5: Show info and results for all teams");
        System.out.println("6: Exit program");
        consoleLayout.lineSeparator();
    }
}
