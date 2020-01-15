import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Mammal {
    int hands = 2;
    int legs = 2;
    String hair = "black";
    int wings = 0;

    public static int walk (int value) {
        int wk;

        if (value>0) {
            System.out.println("walking");
        }else {
            System.out.println("not walking");
        }
        return value;

    }
    public static int sleep(int value ) {

        if (value > 0) {
            System.out.println("not sleeping");

        } else {
            System.out.println("sleeping");
        }
        return value;

    }

    public static int drink(int value ) {
        if (value>0){
            System.out.println("drinking");
        }else {
            System.out.println("not drinking");
        }
        return value;
    }


    public static int  eat(int value){
        if(value >0) {
            System.out.println("eating");
        }else{
            System.out.println("not eating");
        }
        return value;
    }
//can you please explain what exactly should this code perform. thank you .
    public static int showAllAttributes(int value) {
       if(value >0){
           System.out.println("doing everything");
       }else{
           System.out.println("all att");
       }
       return value;
    }
    public static void main (String []args){
            Mammal human = new Mammal();
            Mammal octopus = new Mammal();
            Mammal dog = new Mammal();
            octopus.hands = 8;
            octopus.legs = 0;
            octopus.hair = "white";
            dog.hair = "brown";
            System.out.println(human.hair);

            sleep(5);
        walk(5);
        drink(2);
        eat(1);



    }
}
