import com.sun.codemodel.internal.JArray;

import java.util.Arrays;

public class Homework_returnMethod {


    public static void main(String[] args) {

        String rev = reverse("Sample");
        System.out.println(rev);
        int[] myArray = {25, 15, 3, 2, 40};
        System.out.println("reversed array: " + revArray(myArray));


        //System.out.println(revArray (new int [] {25,15,3,2,40}));

        int[] myNumber = {20, 10, 40, 44};
        System.out.println("Total of numbers: " + sumArray(myNumber));
        int[] sorting = {20, 10, 40, 44};
       // System.out.println("Sorted array" + (sortArray(sorting)));


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
    //does not wort but i already tried everything .

    public static int[] revArray(int[] numbers) {
        int len = numbers.length;
        int[] result = new int[len];
        for (int i = 0; i <= len - 1; i++) {
            result[i] = result[len - 1 - i];

        }
        return result;
    }

    // 3.add all numbers in a given array and return 114
    public static int sumArray(int[] num) {
        int[] nu = {20, 10, 40, 44};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        return sum;
    }

//
//    //4.sort an array (return from method 10,20,40,44)
//
//
//    //5.find average of given array.return 28.
//    public static int[] average(int[]) {
//
//    }
//

}
























                //4.
                //8. create abbreviation for any strings



