public class classWork {
    public static void main (String []args) {
//       int temp = 10;
//
//       if (temp <= 32) {
//            System.out.println("It is freezing outside!");
//
//       } else if (temp >= 100) {
//           System.out.println("It is hot outside!");
//
//        } else {
//           System.out.println("Got for it, its pretty outside");
//       }
//       int count = 100;
//       while (count>=0) {
//           System.out.println("Count:" + count);
//           count--;
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};


        for (String month :months){

            boolean IsTrue = month.equalsIgnoreCase("march");
            if (IsTrue) {
                System.out.println("March i here");
                break;

            }
        }




    }
       }




