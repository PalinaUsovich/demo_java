package basic;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        //the minimum legal age to purchase alcohol in USA.
        //using byte bc 21<128
        byte age = 21;
        System.out.println("The minimum legal age to purchase alcohol in USA is " + age + "." );
        //average monthly salary of an automation engineer in NYC
        double salary= 96.246;
        char dollar ='$';
        System.out.println("Average monthly salary of an automation engineer in NYC: " + salary + dollar+"." );
        //distance between earth and moon in miles
        double distance = 238.900;
        System.out.println("Distance between earth and moon:" + distance +"mi." );
        //the national debt of the united State in US dollars
        //byte bc its too far before 128 and i use word (trillion) to specify the amount .
        byte debt = 22;
        System.out.println("The national debt of the United States in US dollars:"+ debt +" trillion USD.");
        //The interest rate in Chase bank?(use float to store value )
        float checking =0.01F;
        char per= '%' ;
        System.out.println("Chase checking accounts interest rate offer "+checking+per +".");
        float saving=0.09F;
        System.out.println("Chase savings accounts interest rate is about " +saving +per+"." );
        //In which datatype , you should store an item"s price?
        int price1=1000;
        double price2=99.99;
        System.out.println("item'S price can be stored in few ways." + " datatype int "+ price1 + "  " +
                "datatype double "+ price2);
        //but it really depends on requirements !!!!
        //Ans for  "is your gender female?"
        boolean gender =true;
        System.out.println("Is your gender female? "+ gender );
        // your name initials
        char Firstname ='P';
        char Lastname ='U';
        System.out.println("My name initials: "+Firstname +Lastname);
        

    }
}
