import java.util.Scanner;
public class Methods {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Fans name:");
        String fanName = scan.nextLine();

       switch (fanName){
           case"Palina":
           case "Rovshan":
           case "Manuella":
               System.out.println("The fan likes Basketball");
               break;
           case"Victoriya":
           case"Muhammad":
               System.out.println("The fan likes Football");
               break;
           case"Deepak":
           case"Ahsan":
               System.out.println("Not fan of sport");
           default:
       }


//        System.out.println(calculateGpa());
//    }
//    public static int calculateResult(int subOne,int subTwo){
//       return subOne+subTwo;
//    }
//    public  static int calculateGpa(){
//        int gpa=(calculateResult(30,30)
//        +calculateResult(80,30)
//        +calculateResult(40,30))/3;
//        return gpa;
    }

}
