package basic;

import java.util.Arrays;


public class SmallLogic {
    private static int   line  ( int [] numbers){

        int sum = 0;
        for (int i=0;i<numbers.length;i++){
            sum +=numbers[i];

        }
        return sum;
    }
   private static String  abbrevString(String name){
       String result = "";
       for (String r: name.split(" ")){
           result+=r.charAt(0);
           //System.out.println();
       }
       return result;

   }
    private static String[]reversedArray(String[]name){
        int len = name.length;
        String [] name2 = new String [len];
        for (int i=0;i<=len-1; i++){
            //words=words+(len-i);
            name2 [i]=name[len-1-i];
        }

        return name2;
      //  System.out.println();
    }
    private static String reversedString(String name){

        //String word = "Table";
    int len = name.length();
    String reversed="";
    for (int i = 1; i<=len;  i++){
        reversed+=name.charAt(len-i);
       // System.out.println(reversed);
    }
    return reversed;

}




    public static void main(String[] args) {
        System.out.println(reversedString("good morning"));
        String [] words = {"calm", "good","smart"};
        System.out.println(Arrays.toString(reversedArray(words)));
        System.out.println(abbrevString("good night").toUpperCase());
        int []numbers = {10,20,30};
        System.out.println(line((numbers)));



    }
}