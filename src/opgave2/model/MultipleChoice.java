package opgave2.model;

public class MultipleChoice {

    private String[][] multipleChoice = new String[5][10];

    public MultipleChoice(){

        this.multipleChoice = fillQuiz();

    }

    public String[][] getMultipleChoice() {
        return multipleChoice;
    }

    public String[][] fillQuiz(){

        String[][] multipleChoice = new String[5][10];

        for(int i = 0; i < multipleChoice[0].length; i++){

            multipleChoice[0][i] = "Spørgsmål " + (i+1);
            multipleChoice[1][i] = "A";
            multipleChoice[2][i] = "B";
            multipleChoice[3][i] = "C";
            multipleChoice[4][i] = "D";
        }

        return multipleChoice;
    }

    public void printQuiz(){

        String[][] Quiz = this.multipleChoice;

        for(int index = 0; index < multipleChoice[0].length; index++){

            for(int index2 = 0; index2 < multipleChoice.length; index2++){

                System.out.print(Quiz[index2][index] + ", ");

            }
            System.out.println();
        }


    }



}
