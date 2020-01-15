import java.util.Scanner;

public class homework_login {
    public static void main(String[] args) {
        //	 Simple password validation for login system
        //	instance of scanner
        Scanner userName =  new Scanner(System.in);
        //Tell user to enter valid user name
        System.out.println("Please enter your user name: ");
        //instance of scanner for valid password
        Scanner password = new Scanner(System.in);
        //tell user to enter user name
        System.out.println("Please enter your password: ");
        //takes input from console and storing the value into actualPassword  and actualUserName variables
        String actualUserName = userName.nextLine();
        String actualPassword = password.nextLine();
        //setting expected password and user name which are  associated with user account details in database
        //?IF I WANT USER NAME AND PASSWORD BE IGNORED BY UPPER /LOWER CASE IN WHICH LINE SHOULD I ADD.
        String expectedUserName = "palina";
        String expectedPassword = "technosoft";
        //Creating for loop to give user max tries to enter valid password & user name  and log the user to system if
        //correct password or user name is entered
        for (int i = 0; i <5; i++) {
            //checking if actual password & user name are  not equal to expected ones
            if (!actualPassword.equals(expectedPassword) && !actualUserName.equals(expectedUserName)) {

                //subtracting the count by iteration so user will have less tries (-1 every miss tries)
                int count = 5 - i;
                //console message to user to enter valid password and user name
                System.out.println("Please enter invalid password or user name. Please try again. ");
                //console message to let user know how many more tries he has left with
                System.out.println("You have " + count + " more tries");
                //letting user to update the actualPassword(user name) value with new input from console
                actualUserName = userName.nextLine();
                actualPassword = password.nextLine();
                //if count equals to 5, then notifying user with custom message
                if (i == 4) {
                    System.out.println("Your account will be locked for 10 min");
                }
            } else {
                // if any point in the loop user enters correct password and user name then system let user into home page
                System.out.println("Welcome to home page");
                break;
            }
        }
    }
}
/**
 * Test Cases
 * 1. Verify username & password is correct scenario
 */
/**
 * Homework:
 * 1. Create a system that checks valid username and password
 * And if they both are valid then only system displays homepage
 * User can only try upto 5 times with invalid login details
 * if it reaches 5 times then system should be locked for 10 min
 * 2. Fix existing bug from the system
 * 3. Write test cases to validate the scenario
 *
    }
 }
*/