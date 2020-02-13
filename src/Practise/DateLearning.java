package Practise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateLearning {
    public static void main(String[] args) throws ParseException {
        /**
         * Homework:
         * 1. Convert this date into string format "Fri, June 7 2013"
         * 2. Convert this date into string format "Friday, Jun 7, 2013 12:10:56 PM"
         *
         * https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
         */
        Date date = new Date();
        SimpleDateFormat simple = new SimpleDateFormat("EEE, MMMM d, yyyy");
        String formattedDate = simple.format(date);
        System.out.println(formattedDate);
        SimpleDateFormat second = new SimpleDateFormat("EEEE, MMM d, yyyy h:mm:ss a");
        String formattedDate1 = second.format(date);
        System.out.println(formattedDate1);


       //not homework
        String dateInString = "09-21-1995";
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        Date dateDate = sdf.parse(dateInString);
        System.out.println(dateDate);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy MMM dd");
        //to do smth with attributes
        Calendar calender = new GregorianCalendar();
       // System.out.println(sdf1.format(calender.getTime()));
        calender.add(Calendar.MONTH, 5);
        System.out.println(sdf1.format(calender.getTime()));
    }
}
