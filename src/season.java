public class season {
    public static void main (String []args){
        String month = "Aug";
        switch (month) {
            case "Feb":
            case "Dec":
            case "Jan":
                    System.out.println("winter");
            break;
            case "Mar":
            case "Apr":
            case "May":

            System.out.println("spring");
            break;
            case "June":
            case "July":
            case "Aug":
                System.out.println("summer");
                break;
            case "Sep":
            case "Oct":
            case "Nov":
                System.out.println("Fall");
            default :
                System.out.println("You entered invalid inf");

        }
    }


}
