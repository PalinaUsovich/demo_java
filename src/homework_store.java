

public class homework_store {
    static public void main(String[] args) {
       String item ="milk";
       switch (item){
           case "milk":
           case"eggs":
           case"donuts":
               System.out.println("Aisle 8");
               break;
           case "french fries":
           case "frozen pizza":
               System.out.println("Aisle 7");
               break;
           case "candy":
               System.out.println("Aisle 3");
               break;
           case "diapers":
               System.out.println("Aisle 1");
               break;
           case "apple":
           case "orange":
               System.out.println("Aisle 1");
           default:
               System.out.println("Out of stock.");
       }
       String name = "Palina";
       int length=name.length();
           System.out.println(length);
           if (length>8) {
               System.out.println(name.replace("a","A"));


           } else  {
               System.out.println(name.toUpperCase());
           }



        }
    }









