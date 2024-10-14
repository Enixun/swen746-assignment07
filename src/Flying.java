package src;

public abstract class Flying {
  private Flight flightStrategy;
  protected void setFlightStrategy(Flight flightStrategy) {
    this.flightStrategy = flightStrategy;
  }
  /**
   * Method to begin flight.
   */
  protected abstract void takeoff();
  /**
   * Method to end flight.
   */
  protected abstract void land();
  
  public void execute() {
    this.flightStrategy.execute(this);
  }
}
