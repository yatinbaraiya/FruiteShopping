package fruite.shopping.shoppingitems;

public class Melon implements FruitItem {
    @Override
    public String getName() {
        return "Melon";
    }

    @Override
    public int getPrice(int quantity) {
        return (quantity / 2 + quantity % 2) * 50;
    }
}
