class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private int cost = 100;

    CarRental(String n, String m, int r) {
        customerName = n;
        carModel = m;
        rentalDays = r;
    }

    CarRental(CarRental c) {
        customerName = c.customerName;
        carModel = c.carModel;
        rentalDays = c.rentalDays;
    }

    public void calculateTotalCost() {
        System.out.println("Total Cost billed by " + this.customerName + ": " + (rentalDays * cost));
    }

    public void displayDetails() {
        System.out.println("Custome Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
    }

    public void bill() {
        displayDetails();
        calculateTotalCost();
    }
}
