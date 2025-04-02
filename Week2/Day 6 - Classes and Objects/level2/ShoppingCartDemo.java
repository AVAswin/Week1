import java.util.*;

class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String name, double price, int quantity) {
        this.itemName = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class ShoppingCart {
    private ArrayList<CartItem> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        for (CartItem item : cart) {
            if (item.itemName.equals(name)) {
                item.quantity += quantity;
                System.out.println("Updated quantity of " + name + " to " + item.quantity);
                return;
            }
        }
        cart.add(new CartItem(name, price, quantity));
        System.out.println("Added " + quantity + " of " + name + " to cart.");
    }

    public void removeItem(String name) {
        Iterator<CartItem> iterator = cart.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.itemName.equals(name)) {
                iterator.remove();
                System.out.println("Removed " + name + " from cart.");
                return;
            }
        }
        System.out.println("Item not found in cart.");
    }

    public double getTotalCost() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.price * item.quantity;
        }
        return total;
    }

    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty!");
            return;
        }
        System.out.println("Shopping Cart Items:");
        for (CartItem item : cart) {
            System.out.println(item.itemName + " - Price: $" + item.price + " x " + item.quantity + " = $" + (item.price * item.quantity));
        }
        System.out.println("Total Cost: $" + getTotalCost());
    }
}


