package src.factory;

public abstract class FlightSimulator {
  private int count = 0;
  public int count() {
    return count;
  }
  private Flying[] flyers;
  private int size;
  private int currentFlyer = 0;

  public FlightSimulator(int numFlights) {
    this.flyers = new Flying[numFlights];
  }

  public int size() {
    return this.size;
  }

  public void add(String name) {
    if (this.size < flyers.length) {
      flyers[this.size++] = create(name);
      System.out.println(flyers[this.size-1] + " created");
    }
  }

  public void flight() {
    if (this.size == 0) {
      System.out.println("No fliers");
      return;
    }
    Flying f = this.flyers[currentFlyer];
    f.takeoff();
    /* Flying stuff */
    f.land();
    count++;
    this.currentFlyer = (++this.currentFlyer) % this.size;
  }

  public abstract Flying create(String identifier);
}