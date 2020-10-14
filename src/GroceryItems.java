import java.util.ArrayList;
import java.util.HashMap;

public class GroceryItems {
    private String name;
    private int amount;

    public GroceryItems(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}