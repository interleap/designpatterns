package co.interleap.designpatterns.ticket;

public class Ticket
{
    private int ticketno;
    private String origin;
    private String destination;
    private String flightTime;
    private String flightNumber;
    private String seatNumber;

    public Ticket(int ticketno, String origin, String destination, String flightTime, String flightNumber){
        this.ticketno = ticketno;
        this.origin = origin;
        this.destination = origin;
        this.flightTime = flightTime;
        this.flightNumber = flightNumber;
    }

    public void selectSeat(String seatNumber){
        this.seatNumber = seatNumber;
    }

    public String retrieveFlightInformation(){
        return "Origin: " + origin +
                " Destination: " + destination +
                " Flight Time: " + flightTime +
                " Flight Number: " + flightNumber;
    }

    public String getSeatNumber(){
        return seatNumber;
    }
}
