import java.util.Scanner;
public class missingHomework1 {
    public static void main(String[] args) {

        int maxScore  = 100;
        double score = 19;
        double percentage = (score*100)/ maxScore;

            if (percentage>=90){
                System.out.println( "You got: A grade");

            }else if (percentage >=80) {
                System.out.println(" You got : B grade");
            }else if (percentage>=70){
                System.out.println("You got: C grade");
            }else if (percentage>=60){
                System.out.println("You got: D grade");
            }else if (percentage>=0){
                System.out.println("You got :F grade");
            }







//public class homework_Jan6score {
//    public static void main(String[] args) {
        //1.students score , total possible score
        //15/20->you got a C(75%)
        //A 90-100,
        //B 80-89
        //C 70-79
        // D 60-69
        //F 0-59


    }
}