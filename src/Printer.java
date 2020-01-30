import java.util.Scanner;

public class Printer {
   private  int tonerLevel;
   private int maxPages;
   private int pageCount=0;
   private boolean isDoubleSided=true;
   private int  pagesToPrint=10;
   int printedPages;
    /**
     * Build a printer
     * User can set toner level range between 0 to 100 (toner level cannot be greater than 100)
     * User should be able to see number of page printed
     * User should be able to print both sided (Note: in that case printed page should calculated correctly)
     * User can view current toner level at anytime//return
     * single page == single toner level; (Example: Toner = 100, printed page = 20, updated toner = 80)
     * If toner reaches < 1, then print "Low Toner, Please add more toner"
     * Max pages can be printed == 100;
     */

   public  Printer (int tonerLevel,int maxPages){
       this.tonerLevel=tonerLevel;
       this.maxPages=maxPages;
       System.out.println();
   }
   public void sides(boolean isDoubleSided) {
       if (isDoubleSided) {
           System.out.println(pagesToPrint / 2);
       } else {
           System.out.println(pagesToPrint);
       }
   }
   public int printedPages(int pagesToPrint){
       printedPages=printedPages+pagesToPrint;
       pageCount=maxPages-printedPages;
//       if (isDoubleSided){
//           System.out.println( pagesToPrint/2);
//       }else {
//           System.out.println( pagesToPrint);
//       }
       return printedPages;
   }
  // public void  setTonerLevel(int t){
   //    this.tonerLevel=t;
  // }
   public int getTonerLevel(){

       if (tonerLevel<=1){
           System.out.println("Toner level is small. Add more toner !");
       }
       return tonerLevel;
   }
   public void  printerSummary(){
       System.out.println("maxPages: " +maxPages + " printed pages: " + printedPages + " page count: " + pageCount);
   }
   public static void main(String[] args) {
        Printer printer = new Printer(100,100);
        printer.getTonerLevel();
        System.out.println(printer.printedPages(10));

        printer.printerSummary();
        printer.sides(true);



    }

}
