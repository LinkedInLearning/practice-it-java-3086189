package _02_05b;

public class Ticket {

  public Ticket() {

  }

  private String destination;
  private double price;
  private boolean isReturn;

  // Add three public methods to set the value of each field, called
  // setDestination, setPrice and setIsReturn.


  public void setDestination(String destination) {
    this.destination = destination;
  }

  public void setPrice(double value) {
    this.price = value;
  }

  public void setIsReturn(Boolean value) {
    isReturn = value;
  }

  // Add three public methods to get the value of each field, called
  // getDestination, getPrice and getIsReturn.

  public String getDestination(){
    return destination;
  }

  public double getPrice(){
    return price;
  }

  public Boolean getIsReturn(){
    return isReturn;
  }
}
