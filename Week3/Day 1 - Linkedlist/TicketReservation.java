class Ticket {
    int ticketID;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private Ticket last = null;

    // Add a new ticket at the end
    public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);

        if (last == null) {
            last = newTicket;
            last.next = last;
        } else {
            newTicket.next = last.next;
            last.next = newTicket;
            last = newTicket;
        }

        System.out.println("Ticket booked successfully for " + customerName);
    }

    // Remove ticket by ID
    public void removeTicket(int ticketID) {
        if (last == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket current = last.next;
        Ticket prev = last;

        do {
            if (current.ticketID == ticketID) {
                if (current == last && current == last.next) {
                    // Only one ticket
                    last = null;
                } else {
                    prev.next = current.next;
                    if (current == last) {
                        last = prev;
                    }
                }
                System.out.println("Ticket ID " + ticketID + " removed.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != last.next);

        System.out.println("Ticket ID " + ticketID + " not found.");
    }

    // Display all tickets
    public void displayTickets() {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket temp = last.next;
        System.out.println("Current Booked Tickets:");
        do {
            System.out.println("Ticket ID: " + temp.ticketID + ", Customer: " + temp.customerName +
                               ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber +
                               ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != last.next);
    }

    // Search by customer name or movie name
    public void searchTicket(String keyword) {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket temp = last.next;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(keyword) || temp.movieName.equalsIgnoreCase(keyword)) {
                System.out.println("Found -> Ticket ID: " + temp.ticketID + ", Customer: " + temp.customerName +
                                   ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber +
                                   ", Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != last.next);

        if (!found) {
            System.out.println("No matching ticket found for: " + keyword);
        }
    }

    // Count total booked tickets
    public void countTickets() {
        if (last == null) {
            System.out.println("Total Tickets: 0");
            return;
        }

        int count = 0;
        Ticket temp = last.next;
        do {
            count++;
            temp = temp.next;
        } while (temp != last.next);

        System.out.println("Total Tickets Booked: " + count);
    }
}

public class TicketReservation {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(101, "Alice", "Inception", "A1", "18:00");
        system.addTicket(102, "Bob", "Inception", "A2", "18:00");
        system.addTicket(103, "Charlie", "Interstellar", "B1", "20:00");

        system.displayTickets();

        system.searchTicket("Bob");
        system.searchTicket("Interstellar");

        system.countTickets();

        system.removeTicket(102);
        system.displayTickets();
        system.countTickets();
    }
}
