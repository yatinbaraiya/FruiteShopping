package fruite.shopping;

import fruite.shopping.shoppingitems.FruitItem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FinalCheckService {

    private final Map<String, FruitItem> itemCatalog;

    public FinalCheckService(List<FruitItem> items) {
        itemCatalog = new HashMap<>();
        for (FruitItem item : items) {
            itemCatalog.put(item.getName(), item);
        }
    }

    public int calculateTotalCost(FruitCartBasket basket) {
        return basket.getItems().entrySet().stream()
                .mapToInt(entry -> {
                    FruitItem item = itemCatalog.get(entry.getKey());
                    return item.getPrice(entry.getValue());
                })
                .sum();
    }

}
