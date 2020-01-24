import java.sql.SQLOutput;

public class TempHomework {
    public static void main (String[]args){
        //Cels to kelvin T(°C) + 273.15
        double cel=getConvertCel(100);
        if (cel<20) {
            System.out.println("Its cold");

        }else{
            System.out.println(getConvertCel(100));
        }

            System.out.println(getConvertKelvin(70));
            System.out.println(getConvertFahr(32));
            double newCel=getConvertedCelsium(300);
            if( newCel<255){
                System.out.println("It feels like spring");
            }
            System.out.println(getConvertKelvinToFahrenheit(456));


       }

    public static double getConvertCel(double fahrenheit) {
        double celsium = (fahrenheit -32)*5/9;
        return celsium;
    }
    public static double getConvertKelvin (double fahrenheit){
        double kelvin= (fahrenheit + 459.67)* 5/9;
        return kelvin;
    }
    public static double getConvertFahr (double Celsium){
        double fahrenheit =( Celsium * 9/5 + 32);
        return fahrenheit;
    }
    public static double getConvertedCelsium ( double Kelvin){
        double cels= Kelvin-273.15;
        return cels;
    }
    public static double getConvertKelvinToFahrenheit (double Kelvin){
        double newFahrenheit =Kelvin * 9/5 - 459.67;
        return newFahrenheit;
    }
//
}