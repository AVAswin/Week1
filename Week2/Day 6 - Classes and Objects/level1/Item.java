import java.util.*;

class Item {
    String itemCode;
    String itemName;
    int price;

    Item(String i, String l, int m) {
        itemCode = i;
        itemName = i;
        price = m;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public void calculateTotal(int q) {
        int total = q * price;
        System.out.println("Total: " + total);
    }
}


