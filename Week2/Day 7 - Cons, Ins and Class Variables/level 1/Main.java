class Main {
    public static void main(String[] args) {
        // Book
        Book b1 = new Book();
        Book b2 = new Book("All we go", "Aswin", 100);

        b1.displayDetails();
        b2.displayDetails();
        Book.totalBooksCreated();

        // Circle
        System.out.println("-----------------------------");
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.26);
        Circle c3 = new Circle(c2);

        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
        Circle.totalCirclesCreated();

        // Person Class
        System.out.println("----------------------------");
        Person p1 = new Person();
        Person p2 = new Person("Aswin", 22, 'M');
        Person p3 = new Person(p2);

        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
        Person.calculateTotalPersons();

        // HotelBooking Class
        System.out.println("----------------------------");
        HotelBooking h1 = new HotelBooking("Aswin", "Regular", 2);
        HotelBooking h2 = new HotelBooking(h1);

        h1.displayDetails();
        h2.displayDetails();
        HotelBooking.calculateTotalBookings();

        // Libary Management 
        System.out.println("----------------------------");
        Book bb1 = new Book("Gladiator", "Moron", 100);

        bb1.borrow();
        bb1.borrow();
        bb1.returnBook();
        bb1.isAvailable();
        bb1.borrow();
        bb1.isAvailable();

        // Car Rental
        System.out.println("----------------------------");
        CarRental car1 = new CarRental("Vijaya", "BMW", 12);
        car1.bill();

        

    }
}
