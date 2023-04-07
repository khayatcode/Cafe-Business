import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    
    public static void main(String[] args){

        CafeUtil cafe = new CafeUtil();

        int streak = cafe.getStreakGoal();

        int streakNum = cafe.getStreakGoal(200);

        /* ============ App Test Cases ============= */
    
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", streak);

        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", streakNum);
    
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",cafe.getOrderTotal(lineItems));
        
        System.out.println("----- Display Menu Test-----");
        
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        cafe.displayMenu(menu);

        System.out.println("\n----- Product Price Chart -----");
        String productName = "Coffee";
        double productPrice = 3.00;
        int maxQuantity = 4;
        cafe.printPriceChart(productName, productPrice, maxQuantity);

        System.out.println("\n----- Display Menu With Prices Test-----");
        
        ArrayList<String> secondMenu = new ArrayList<String>();
        secondMenu.add("drip coffee");
        secondMenu.add("cappuccino");
        secondMenu.add("latte");
        secondMenu.add("mocha");
        ArrayList<Double> menuPrices = new ArrayList<Double>();
        menuPrices.add(1.5);
        menuPrices.add(2.0);
        menuPrices.add(4.5);
        menuPrices.add(3.5);
        cafe.displayMenu(secondMenu, menuPrices);

        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers1 = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            cafe.addCustomer(customers1);
            System.out.println("\n");
        }

        System.out.println("\n----- Add Customer Test Until Stop Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        cafe.addCustomerUntilStop(customers);
    }




}
