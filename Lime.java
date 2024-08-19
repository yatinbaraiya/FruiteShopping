package fruite.shopping.shoppingitems;

public class Lime implements FruitItem {
    @Override
    public String getName() {
        return "Lime";
    }

    @Override
    public int getPrice(int quantity) {
        return (quantity / 3 * 2 + quantity % 3) * 15;
    }
}
