package Application;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Login {
    private String userId;
    private String password;
    private String[] userIDs = {"foo", "bar", "endGame", "GOT"};

    public Login(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public void enterUserId() {
        boolean found = false;
        int len = userId.length();
        for (String user : userIDs) {
            if (user == userId) {
                found = true;
                break;
            }
        }
        if (len <= 3 && found) {
            System.out.println(userId + " UserID is too short or already exists ");

        } else {
            System.out.println(userId + " Correct userID");
        }
    }

    public void enterPassword() {
        int len = password.length();
        Pattern sPattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher sMatcher = sPattern.matcher(password);
        if (!sMatcher.matches()) {
            System.out.println("contains special characters");
        } else {
            System.out.println("Should contains special characters");
            if (len >= 8 && password.contains(userId)) {
            } else {
                System.out.println("invalid password: contains user name or its too short (should be minimum  8 characters) ");
            }
            if (!sMatcher.matches()) {
                System.out.println("contains special characters");
            } else {
                System.out.println("Should contains special characters");
//}


                /**
                 * Homework:
                 * 1. When opening account, customer must enter userID (Minimum 3 characters long,
                 *    It cannot be one that which is already taken from userIDs list);
                 * 2. User must select password which must follow following:
                 *    A. Minimum 8 character long
                 *    B. Alpha Numeric
                 *    c. Must not contain username
                 * 3. Once account is created and initial balance is set, user should be able to withdraw
                 *    Money from their account: (Note: They cannot withdraw more than what they have in the account
                 *    For Example: If the balance is $300, they should not be allowed to withdraw anything greater than $300)
                 * 4. Set Account creation date
                 * 5. User should be able to delete an account
                 */
            }
        }
    }
}
