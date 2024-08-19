package fruite.shopping;

import fruite.shopping.shoppingitems.*;

import java.util.Arrays;
import java.util.List;


public class MainShopping {

    public static void main(String[] args) {
        // Creating the FruitCartBasket using a stream
        FruitCartBasket basket = new FruitCartBasket();
        Arrays.asList(
                new Apple(), new Apple(), new Banana(),
                new Melon(), new Melon(),
                new Lime(), new Lime(), new Lime(), new Lime()
        ).forEach(basket::addItem);

        // Creating the list of cart items using a stream
        List<FruitItem> cartItems = Arrays.asList(
                new Apple(), new Banana(), new Melon(), new Lime()
        );

        FinalCheckService checkoutService = new FinalCheckService(cartItems);
        int totalCost = checkoutService.calculateTotalCost(basket);

        System.out.println("Total cost: " + totalCost + "p");

    }
}