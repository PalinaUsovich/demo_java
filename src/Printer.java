import java.util.Scanner;

public class Printer {
   private  int tonerLevel;
   private int maxPages;
   private int pageCount;
   private boolean isDoubleSided=true;
   private int  pagesToPrint;
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

   public Printer (int tonerLevel,int maxPages){
       this.tonerLevel=tonerLevel;
       this.maxPages=maxPages;
   }
//   public void sides(boolean isDoubleSided) {
//       if (isDoubleSided) {
//           System.out.println(pagesToPrint / 2);
//       } else {
//           System.out.println(pagesToPrint);
//       }
   //}
   public void printedPages(int pagesToPrint , boolean singlesided) {
       if (pagesToPrint > 0) {
           if (pagesToPrint > tonerLevel) {
               System.out.println("Ink not available");
           } else {
               int pagesRequiredToPrint = countRequiredPages(pagesToPrint, singlesided);
               if (pagesRequiredToPrint <= maxPages) {
                   maxPages = maxPages - pagesRequiredToPrint;
                   tonerLevel = tonerLevel - pagesToPrint;
                   System.out.println("Printing " + pagesToPrint + " pages; single side - " + singlesided);
               } else {
                   System.out.println("Pages are less than required");
               }

           }
       } else {
           System.out.println("Invalid pages value");
       }
/*
       printedPages=printedPages+pagesToPrint;
       pageCount=maxPages-printedPages;
//       if (isDoubleSided){
//           System.out.println( pagesToPrint/2);
//       }else {
//           System.out.println( pagesToPrint);
//       }
       return printedPages;*/
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
       System.out.println("Pages in printer: " + maxPages + "\nToner level: " + getTonerLevel());
   }

   public int countRequiredPages(int pagesEnteredByUser, boolean isSingle) {
       int pagesRequiredToPrint = 0;
       if (isSingle) {
           pagesRequiredToPrint = pagesEnteredByUser;
       } else {
           if (pagesEnteredByUser % 2 == 0) {
               pagesRequiredToPrint = pagesEnteredByUser / 2;
           } else {
               pagesRequiredToPrint = pagesEnteredByUser / 2 + 1;
           }
       }
       return pagesRequiredToPrint;
   }


   public static void main(String[] args) {
       Printer printer = new Printer(100,100);
       printer.printerSummary();
       printer.printedPages(5, false);

       printer.printerSummary();
      //  printer.sides(true);



    }

}
