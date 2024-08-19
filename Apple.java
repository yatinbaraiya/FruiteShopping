package fruite.shopping.shoppingitems;

public class Apple implements FruitItem {

    @Override
    public String getName() {
        return "Apple";
    }

    @Override
    public int getPrice(int quantity) {
        return quantity * 35;
    }
}
