package opgave2.model;

import java.util.Arrays;

public class MultipleChoice {

    private String[][] multipleChoice;
    private char[] correctAnswers;

    public MultipleChoice(){
        fillQuiz();
        generateCorrectAnswers();
    }

    public char[] getCorrectAnswers() {
        return correctAnswers;
    }

    private String[][] fillQuiz() {

        multipleChoice = new String[5][10];

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

    private void generateCorrectAnswers(){
        correctAnswers = new char[10];
        // fill array with correct answers
        Arrays.fill(correctAnswers, 'B');
    }

}
