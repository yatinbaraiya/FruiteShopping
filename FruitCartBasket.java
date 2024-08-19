package fruite.shopping;

import fruite.shopping.shoppingitems.FruitItem;

import java.util.HashMap;
import java.util.Map;

public class FruitCartBasket {
    private final Map<String, Integer> items = new HashMap<>();

    public void addItem(FruitItem item) {
        items.put(item.getName(), items.getOrDefault(item.getName(), 0) + 1);
    }

    public Map<String, Integer> getItems() {
        return items;
    }

}
