package src;

public abstract class FlightSimulator {
  private int count = 0;
  public int count() {
    return count;
  }
  /**
   * Array of flying items
   */
  private Flying[] fliers;
  private int size;
  private int currentFlier = 0;

  /**
   * Flight Simulator constructor
   * @param numFlights - max number of flights
   */
  public FlightSimulator(int numFlights) {
    this.fliers = new Flying[numFlights];
  }

  public int size() {
    return this.size;
  }

  /**
   * Add a new flier to the list
   * @param name - Flier identifier
   * @param strategy - Flight strategy (short, medium or long)
   */
  public void add(String name, Flight strategy) {
    if (this.size < fliers.length) {
      fliers[this.size++] = create(name, strategy);
      System.out.println(fliers[this.size-1] + " created");
    }
  }

  /**
   * Simulate the flight of a flier
   */
  public void flight() {
    if (this.size == 0) {
      System.out.println("No fliers");
      return;
    }
    this.fliers[currentFlier].execute();
    count++;
    this.currentFlier = (++this.currentFlier) % this.size;
  }

  /**
   * Returns a new Flier, with provided identifier
   * @param identifier
   * @return
   */
  public abstract Flying create(String identifier, Flight strategy);
}