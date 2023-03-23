package Class;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
  private Date today = new Date();
  public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
  private int roomNumber;
  private Date checkIn;
  private Date checkOut;
  
  public Reservation(int roomNumber, Date checkIn, Date checkOut) {
    if(!checkOut.after(checkIn) || checkIn.before(today) || checkOut.before(today)) {
      throw new IllegalStateException("Reservation error: Check-Out date must be after or before the Check-In date.");
    }

    this.roomNumber = roomNumber;
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  public int getRoomNumber() {
    return roomNumber;
  }

  public Date getCheckIn() {
    return checkIn;
  }

  public Date getCheckOut() {
    return checkOut;
  }

  public long duration () {
    long duration = checkOut.getTime() - checkIn.getTime();

    return TimeUnit.DAYS.convert(duration, TimeUnit.MILLISECONDS);
  }

  public void updateCheckInAndCheckOut(Date newCheckIn, Date newCheckOut) {
    if(!newCheckOut.after(newCheckIn) || checkIn.before(today) || checkOut.before(today)) {
      throw new IllegalStateException("Reservation error: Check-Out date must be after or before the Check-In date.");
    }

    this.checkIn = newCheckIn;
    this.checkOut = newCheckOut;
  }

  @Override
  public String toString() {
    return  "Room number: " + roomNumber + 
            ", Check-in (dd/MM/yyyy): " + dateFormat.format(checkIn )+ 
            ", Check-out (dd/MM/yyyy): " + dateFormat.format(checkOut) +
            ", " + duration() + " nights." ;
  }
  
}