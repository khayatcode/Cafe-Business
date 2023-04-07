import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {
    
    public int getStreakGoal(){
        int sum = 0;
        for(int i = 0; i <= 10; i++){
            sum += i;
        }
        return sum;
    }

    public int getStreakGoal(int num){
        int sum = 0;
        for(int i = 0; i <= num; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double sum = 0;

        for(int i = 0; i < prices.length; i++){
            sum += prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){

        for(int i = 0; i < menuItems.size(); i++ ){
            System.out.println(menuItems.get(i));
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices ){

        int menuSize = menuItems.size();
        int pricesSize = prices.size();
        if(menuSize != pricesSize){
            System.out.println("Sorry, we cant load up the prices for our menu.");
            return false;
        }
        else{
            for(int i = 0; i < menuItems.size(); i++){
                int listNum = i + 1;
                String product = menuItems.get(i);
                double price = prices.get(i);
                System.out.printf("\n%d %s - - $%.2f", listNum, product, price);
            }
            return true;
        }
    }

    public void addCustomer(ArrayList<String> customers){

        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s!", userName );
        customers.add(userName);
        int peopleAhead = customers.size() - 1;

        if(peopleAhead == 0){
            System.out.println(" There is no one in front of you. Your next!");
        }
        else{
            System.out.printf(" There are %d people in front of you, please wait patiently in line.", peopleAhead);
        }
        System.out.println("\n----- Customers line -----");
        for(String name : customers){
            System.out.println(name);
        }
    }

    public void addCustomerUntilStop(ArrayList<String> customers) {
        boolean keepAdding = true;
        while (keepAdding) {
            System.out.println("\nPlease enter a customer name (or type 'q' to finish):");
            String input = System.console().readLine();
            if (input.equals("q")) {
                keepAdding = false;
                System.out.println("Thanks for using the program! Goodbye.");
            } 
            else {
                System.out.printf("\nHello, %s!", input);
                customers.add(input);
                int peopleAhead = customers.size() - 1;
                if (peopleAhead == 0) {
                    System.out.println("\nThere is no one in front of you. You're next!");
                } 
                else {
                    System.out.printf("\nThere are %d people in front of you. Please wait patiently in line.\n", peopleAhead);
                }
                System.out.println("\n----- Customers line -----");
                for (String name : customers) {
                    System.out.println(name);
                }
            }
        }
    }

    void printPriceChart(String product, double price, int maxQuantity){
        // int[] productList;
        // productList = new int[maxQuantity];
        System.out.println(product);
        double productPrice = price;
        double sum = productPrice;
        double productDiscount = 0.5;
        for(int i = 1; i <= maxQuantity; i++){
            System.out.printf("\n%d - $%.2f", i, sum);
            sum += (productPrice - productDiscount);
        }
    }


}
