package src.factory;

public class Bird implements Flying {
  private String breed;

  /**
   * Bird constructor
   * @param breed - Species common name
   */
  public Bird(String breed) {
    this.breed = breed;
  }

  public String breed() {
    return this.breed;
  }

  public void takeoff() {
    System.out.println("The " + this.breed + " takes flight...");
  }

  public void land() {
    System.out.println("The " + this.breed + " lands.");
  }

  @Override
  public String toString() {
    return this.breed;
  }
}