package src.factory;

public class PlaneFlightSimulator extends FlightSimulator {
  public PlaneFlightSimulator(int numFlights) {
    super(numFlights);
  }

  @Override
  public Plane create(String model) {
    return new Plane(model);
  }

  public static void main(String[] args) {
    // PlaneFlightSimulator pfs = new PlaneFlightSimulator(4);
    // pfs.flight();
    // pfs.add("Boeing 747");
    // pfs.add("Boeing B-52");
    // pfs.add("Curtiss JN-4");
    // pfs.flight();
    // pfs.flight();
    // pfs.flight();
    // System.out.println(PlaneFlightSimulator.count());
  }
}