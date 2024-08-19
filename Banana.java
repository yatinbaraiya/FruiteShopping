package fruite.shopping.shoppingitems;

public class Banana implements FruitItem {
    @Override
    public String getName() {
        return "Banana";
    }

    @Override
    public int getPrice(int quantity) {
        return quantity * 20;
    }
}
