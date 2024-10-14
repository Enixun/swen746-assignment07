package src;
import java.util.Random;

public class TestFlightSimulators {
  public static final Random RNG = new Random(2);

  public static void test(FlightSimulator fs, String[] flyerNames) {
    System.out.println("Flight before init:");
    fs.flight();
    System.out.println("Adding flyers..");
    for (String n: flyerNames) {
      Flight flight;

      switch (RNG.nextInt(3)) {
        case 0:
          flight = new MediumFlight();
          break;
        case 1:
          flight = new LongFlight();
          break;
        default:
          flight = new ShortFlight();
      }

      fs.add(n, flight);
    }
    System.out.println("Begin " + fs.size() * 2 +" flights...");
    for (int i = 0; i < fs.size() * 2; i++) {
      fs.flight();
    }
    System.out.println("Flight count: " + fs.count() + "\n");
  }
  public static void main(String[] args) {
    BirdFlightSimulator bfs = new BirdFlightSimulator(3);
    String[] birdBreeds = {"Bluejay", "Cardinal", "Pigeon"};
    test(bfs, birdBreeds);

    PlaneFlightSimulator pfs = new PlaneFlightSimulator(3);
    String[] planeModels = { "Boeing 747", "Boeing B-52", "Curtiss JN-4" };
    test(pfs, planeModels);
  }
}