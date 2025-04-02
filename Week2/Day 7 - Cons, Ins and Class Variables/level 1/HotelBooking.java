class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;
    static int totalBookings = 0;

    HotelBooking(String name, String type, int nights) {
        guestName = name;
        roomType = type;
        this.nights = nights;
        totalBookings++;
    }

    HotelBooking(HotelBooking h) {
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
        totalBookings++;
    }

    public void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void calculateTotalBookings() {
        System.out.println("Total Bookings: " + totalBookings);
    }
}
