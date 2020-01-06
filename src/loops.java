import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class loops {
    public static void main(String[] args) {
//        int count = 50;
//        while (count <= 100) {
//            if (count % 2 == 0) {
//                System.out.println(count);
//
//            }
//            count++;


        // }
        //for (int i = 100; i> 0; i = i-5) {
        //  System.out.println(i);
        // }
//        String word = "racecar";
//        String reString="";
//        char [] strArr = word.toCharArray();
//        for (int i= strArr.length-1;i>=0;i--){
//            reString=reString+strArr [i];
//
//        } if (word.equals(reString)) {
//            System.out.println("This is a Palindrome");
//        } else
//            System.out.println("This is not a palindrom");

        String[] words = {"happy", "son", "piece", "cold"};
        for (int i = 0; i <= words.length - 1; i++) {
            if (words[i].contains("a")) {
                // for (int i = 0; i <= words.length - 1; i++) {
                System.out.println(words[i]);
            }
        }

    }

}


