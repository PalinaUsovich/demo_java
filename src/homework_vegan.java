
public class homework_vegan {
     public static void main (String[]args) {
       //Menu.
        boolean isGuestOneVegan = true;
        boolean isGuestTwoVegan = true;

        if(isGuestOneVegan && isGuestTwoVegan) {
            System.out.println("Kale salad, veggie burger");
       }else if  (isGuestOneVegan || isGuestTwoVegan) {
            System.out.println(("Kale salad, Chicken and broccoli,Fried tofu"));
       }else {
            System.out.println("Salmon, Lamb Chops, Chicken Marsala");
        }
        //divisible
         int number = 25;

         if (number%15==0){
             System.out.println("The number is divisible by 15");
         }else{
             System.out.println("the remainder is");
         }
         //driver
         boolean pMode = false;
         boolean dMode = false;
         boolean nMode = false;
         boolean rMode = false;
         if (pMode) {
             System.out.println("I can park between two cars.");
         } else if (dMode) {
             System.out.println("I can put drive type to snow type.");
         } else if (nMode) {
             System.out.println("I can put car in car wash station.");
         } else if (rMode) {
             System.out.println("I can only reverse the car and car will activate back camera.");
         } else {
             System.out.println("Invalid mode type, please check your car mode!");
         }
     }
}






























