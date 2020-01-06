

import java.util.Scanner;
class scanner {
    public static void main(String[] args) {

//    public static void main(String[] args) {
        //1.students score , total possible score
        //15/20->you got a C(75%)
        //A 90-100,
        //B 80-89
        //C 70-79
        // D 0-59


        //2.Write a logic that prints multiplication table of the user provided number up to ten
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = scan.nextInt();
        for (int i=1;i<=10;i++) {
            System.out.println(n+ "*"+i+"=" +n*i);



            //3. Write a logic that checks if a number is a Prime number

            //  Scanner scan = new Scanner(System.in);
            //  System.out.println("Enter your score:");
            //  int number = scan.nextInt();
            //  boolean ans= false;
            // for (int i = 2; i <= number/ 2; ++i) {
            //     if (number % i == 0) {
            //        ans = true;
//                break;


//            }
//        }
//        if (!ans)
//            System.out.println(number + " its a  prime number ");
//        else
//            System.out.println(number + " not prime number ");
        }
    }
}









