public class TestScores {


//Write a program that declares 6 variables (data type int) to hold
//6 test scores. The program should display the average of the test
//scores and then display letter grade that is assigned for the test
//score average. Use the following table for the grading the average
//test score:
//93-100 = A
//85-92 = B
//70-84 = C
//60-69 = D
//Below 60 = F

    public static String gradeScores(int[] scores){

        int tempScore=0;
        for (int i = 0; i <= scores.length-1; i++){
            tempScore += scores[i];
        }
        int avg = tempScore/scores.length;
        String grade;

        if( avg >= 93 && avg <= 100){
            grade = "A";

        }
        else if (avg >= 85 && avg <= 92){
            grade = "B";
        }
        else if (avg >= 70 && avg <= 84){
            grade = "C";
        }
        else if (avg >= 60 && avg <= 69){
            grade = "D";
        }

        else {
            grade = "F";
        }
        return  "The grade is " + grade + " the average is " + avg;
    }

}

class Dothings{

    TestScores score = new TestScores();

    public static void main(String[] args) {
        int [] score1 = { 90,95,100,82,76,81 };
        int [] score2 = { 40,50,30,80,68,81 };

        System.out.println(TestScores.gradeScores(score1));
        System.out.println(TestScores.gradeScores(score2));

    }
}

