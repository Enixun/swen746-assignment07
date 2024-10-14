package src;

public class Bird extends Flying {
  private String breed;

  /**
   * Bird constructor
   * @param breed - Species common name
   */
  public Bird(String breed, Flight strategy) {
    this.breed = breed;
    this.setFlightStrategy(strategy);
  }

  public String breed() {
    return this.breed;
  }

  @Override
  protected void takeoff() {
    System.out.println("The " + this.breed + " takes flight...");
  }

  @Override
  protected void land() {
    System.out.println("The " + this.breed + " lands.");
  }

  @Override
  public String toString() {
    return this.breed;
  }
}