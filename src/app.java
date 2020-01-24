//public class app {
//    public static void  main (String []args){
//        Restaurant restaurant =new Restaurant();
//
//            restaurant.openRestaurantSummary("lola", 40, 0);
//            restaurant.removeParty(10);
//            System.out.println(restaurant.isAvailableSeats(5));
//            restaurant.seatParty(10);
//            System.out.println(restaurant.isAvailableSeats(5));
//            System.out.println(();
//








  //  }

//}
///**
// * Create a restaurant class with attribute name, guestCapacity, guestCount
// * 1. Create a method that tells user if the seats are available
// * 2. Create a method that seatsParty
// * 3. Create a method that removesParty
// * 4. Create a method that allows host open for services by passing restaurant name/guestCapacity
// * 5. Create a method that printsRestaurantSummary
// */
//8:05
//package sample;
///**
// * Set user attribute such as name, age, income, expense
// * 1. Create a method that gets accountSummary which includes, users name, Income, Expense, etc
// * 2. Create a method that gets account balance
// * 3. Create a method that sets userDetails such as name, age
// * 4. Create a method that sets expense
// * 5. Create a method that sets income
// * 6. Create a method that resets account balance which means sets amount to 0
// *
// */
//public class User {
//    private String name;
//    private int age;
//    private double income;
//    private double expense;
//    public void printSummary() {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Income: " + income);
//        System.out.println("Expense: " + expense);
//    }
//    public double getAccountBalance() {
//        return income - expense;
//    }
//    public void setDetails(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    public void setExpense(double expense) {
//        this.expense += expense;
//    }
//    public void setIncome(double income) {
//        this.income += income;
//    }
//    public void resetBalance(){
//        income = 0;
//        expense = 0;
//    }
//}
//8:06
//    public static void main(String[] args) {
//        User user = new User();
//       // user.printSummary();
//       // System.out.println(user.getAccountBalance());
//        user.setDetails("Mohammad", 33);
//       // user.printSummary();
//        user.setIncome(100);
//        user.setIncome(300);
//        user.setExpense(5);
//        user.setExpense(2);
//        //System.out.println(user.getAccountBalance());
//        user.printSummary();
//        user.resetBalance();
//        user.printSummary();
//    }