package Practise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateLearning {
    public static void main(String[] args) throws ParseException {
        /**
         * Homework:
         * 1. Convert this date into string format "Fri, June 7 2013"
         * 2. Convert this date into string format "Friday, Jun 7, 2013 12:10:56 PM"
         *
         * https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
         */
       // Date date = new Date();
        //System.out.println(date);
        String givenDate = "06-07-2013";
        SimpleDateFormat simple = new SimpleDateFormat("EEE, MMM d, ''yyyy");
       // Date date1 = simple.parse(givenDate);
       String formattedDate = simple.format(givenDate);
        System.out.println(formattedDate);
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy h:mm:ss a ");
        String givenDate2 = "06-07-2013 12:10:56 pm";
        Date parsedDate = sdf.parse(givenDate2);
        System.out.println(parsedDate);

    }
}
