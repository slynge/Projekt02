package opgave2.model;

public class MultipleChoice {

    private String[][] multipleChoice = new String[5][10];


    public MultipleChoice(){
        this.multipleChoice = fillQuiz();
    }

    public String[][] getMultipleChoice() {
        return multipleChoice;
    }

    private String[][] fillQuiz() {

        String[][] multipleChoice = new String[5][10];

        for (int index = 0; index < multipleChoice[0].length; index++) {
            multipleChoice[0][index] = "Spørgsmål " + (index + 1);
            multipleChoice[1][index] = "A";
            multipleChoice[2][index] = "B";
            multipleChoice[3][index] = "C";
            multipleChoice[4][index] = "D";
        }
        return multipleChoice;
    }

    public void printQuiz(){

        String[][] Quiz = fillQuiz();

        for(int outerIndex = 0; outerIndex < multipleChoice[0].length; outerIndex++){

            for(int innerIndex = 0; innerIndex < multipleChoice.length; innerIndex++){
                if (innerIndex == 0){
                    System.out.print(Quiz[ innerIndex][outerIndex]);
                } else {
                    System.out.print(" | " + Quiz[ innerIndex][outerIndex]);
                }
            }
            System.out.println(" |");
            System.out.println();
        }
    }

    public char[] correctAnswers(){
        char[] array = new char[10];
        for(char character : array) character = 'A';
        return array;
    }

}
