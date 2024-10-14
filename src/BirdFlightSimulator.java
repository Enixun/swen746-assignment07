package src;

public class BirdFlightSimulator extends FlightSimulator{
  @Override
  public Flying create(String breed, Flight strategy) {
    return new Bird(breed, strategy);
  }

  public BirdFlightSimulator(int numFlights) {
    super(numFlights);
  }

  public static void main(String[] args) {
    // BirdFlightSimulator bfs = new BirdFlightSimulator(12);
    // bfs.flight();
    // bfs.add("Bluejay");
    // bfs.add("Cardinal");
    // bfs.add("Pigeon");
    // bfs.flight();
    // bfs.flight();
    // bfs.flight();
    // System.out.println(BirdFlightSimulator.count());
  }
}
