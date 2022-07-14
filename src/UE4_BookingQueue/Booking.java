package UE4_BookingQueue;

public class Booking
{
    // *** Membervariablen ***
    private String bookingText;
    private double amount;

    // *** Konstruktor ***

    public Booking(String bookingText, double amount)
    {
       this.bookingText = bookingText;
       this.amount = amount;
    }

    // *** Getter-Methoden ***

    public String getBookingText()
    {
       return bookingText;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setBookingText(String bookingText) {
        this.bookingText = bookingText;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
