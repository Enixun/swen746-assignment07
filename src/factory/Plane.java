package src.factory;

public class Plane implements Flying {
  private String model;

  public Plane(String model) {
    this.model = model;
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