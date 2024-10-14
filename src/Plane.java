package src;

public class Plane extends Flying {
  private String model;

  /**
   * Plane constructor
   * @param model - Plane model name
   */
  public Plane(String model, Flight strategy) {
    this.model = model;
    this.setFlightStrategy(strategy);
  }

  public void takeoff() {
    System.out.println("Plane " + this.model + " departs the airport.");
  }

  public void land() {
    System.out.println("Plane " + this.model + " arrives on the tarmac.");
  }

  @Override
  public String toString() {
    return this.model;
  }
}