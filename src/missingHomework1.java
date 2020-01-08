import java.util.Scanner;
public class missingHomework1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score:");
        int score = scan.nextInt();
        if (score <= 69) {
            System.out.println("you got a: D");
        } else if (score <= 89 && score > 79) {

            System.out.println("you got a: B");


        } else if (score <= 100 && score > 89) {
            System.out.println("you got a: A");
        } else if (score <= 79 && score > 69) {
            System.out.println("you got a: C");

        } else {
            System.out.println("Wrong number! Try again.");


        }


//public class homework_Jan6score {
//    public static void main(String[] args) {
        //1.students score , total possible score
        //15/20->you got a C(75%)
        //A 90-100,
        //B 80-89
        //C 70-79
        // D 0-59
        //F


    }
}