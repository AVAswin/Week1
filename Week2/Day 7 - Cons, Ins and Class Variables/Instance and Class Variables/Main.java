class Main {
    public static void main(String[] args) {
        // Product Class
        Product p1 = new Product("Mouse", 200);
        p1.displayDetails();
        Product p2 = new Product("Keyboard", 500);
        p2.displayDetails();
        Product.calculateTotalProducts();

        // Course Class
        System.out.println("-----------------------------------------------------");
        Course c1 = new Course("Computer", 6, 100000);
        c1.displayDetails();
        System.out.println(Course.instituteName);
        Course.updateInstituteName("VIT");
        System.out.println(Course.instituteName);

        // Course Class
        System.out.println("-----------------------------------------------------");
        Vehicle v1 = new Vehicle("Austin", "Rolls Royce");
        v1.displayDetails();
        System.out.println(Vehicle.registrationFee);
        Vehicle.updateRegistrationFee(400);
        System.out.println(Vehicle.registrationFee);
    }
}
