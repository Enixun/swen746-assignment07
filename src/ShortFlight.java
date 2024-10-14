package src;

public class ShortFlight implements Flight{

  @Override
  public void execute(Flying f) {
    f.takeoff();
    System.out.println(f.toString() + " flies for 5 minutes..");
    f.land();
  }
}