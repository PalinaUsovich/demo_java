import com.sun.codemodel.internal.JArray;
import java.util.Arrays ;
import java.util.Arrays;

public class Homework_returnMethod {


    public static void main(String[] args) {

        String rev = reverse("Sample");
        System.out.println(rev);
        int[] myArray = {25, 15, 3, 2, 40};
        System.out.println("reversed array: " + (Arrays.toString(revArray(myArray))));
        double[] myNumber = {20, 10, 40, 44};
        int[] muNumber = {20, 10, 40, 44};
        System.out.println("Total of numbers: " + sumArray(muNumber));
        System.out.println("average is :" + aV(myNumber));
        int[] newNumbers = {20, 10, 40, 44, 32};
        System.out.println("the max value:" + getMaxValue(newNumbers));
        System.out.println("the min value:"+getMinValue(newNumbers));
        String getAbbrev ="Happy New Year ";
       // System.out.println("Get Abbreviation :" + abbrev(getAbbrev));
        // System.out.println("Sorted array:" + Arrays.toString(sortingArray(muNumber)));


    }

    //1.return reversed string
    public static String reverse(String Sample) {

        String reverse = "";
        for (int i = Sample.length() - 1; i >= 0; i--) {
            reverse = reverse + Sample.charAt(i);
        }
        return reverse;

    }
    //2.reverse an array


    public static int[] revArray(int[] num) {
        int numLen = num.length;
        int[] result1 = new int[numLen];
        for (int i = 0; i <= numLen - 1; i++) {
            result1[i] = num[numLen - 1 - i];
        }
        return result1;
    }

    // 3.add all numbers in a given array and return 114
    public static int sumArray(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        return sum;
    }

    //    //4.sort an array (return from method 10,20,40,44)??????


    //5.find average of given array.return 28.5
    public static double aV(double[] myArray) {
        double sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = myArray[i] + sum;
        }
        double average;
        average = sum / 4;
        return average;
    }

    //6.find max number in given array
    public static int getMaxValue(int[] max) {
        int maxValue = max[0];
        for (int i = 1; i < max.length; i++) {
            if (max[i] > maxValue) {
                maxValue = max[i];
            }
        }
        return maxValue;
    }
    //7.find the min value in given array
    public static int getMinValue(int []min) {
        int minValue = min[0];
        for (int i = 1; i < min.length; i++) {
            if (min[i] < minValue) {
                minValue = min[i];

            }
        }

        return minValue;
    }
//    //8.create abbreviation for any string
//    public static String  abbrev (String newAbbrev){
//        String acronym="";
//        for( int i = 0 ; {
//
//
//
//
//        }
//
//        return acronym.toUpperCase();
//    }



}
//






























