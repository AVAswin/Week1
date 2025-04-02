class MovieTicket {
    String movieName;
    String seatNumber;
    int price;

    MovieTicket(String n, String s, int p) {
        movieName = n;
        seatNumber = s;
        price = p;
    }

    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}
