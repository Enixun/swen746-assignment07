package src;

public class LongFlight implements Flight{

  @Override
  public void execute(Flying f) {
    f.takeoff();
    System.out.println(f.toString() + " flies for 3 hours..");
    f.land();
  }
}