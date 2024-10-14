package src;

public class MediumFlight implements Flight{

  @Override
  public void execute(Flying f) {
    f.takeoff();
    System.out.println(f.toString() + " flies for 30 minutes..");
    f.land();
  }
}