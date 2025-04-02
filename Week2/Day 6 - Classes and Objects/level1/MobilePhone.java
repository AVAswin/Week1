import java.util.*;

class MobilePhone {
    private String brand;
    private String model;
    private int price;

    MobilePhone(String b, String m, int p) {
        brand = b;
        model = m;
        price = p;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
