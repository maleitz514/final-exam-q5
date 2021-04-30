package edu.bu.met.cs665;

import java.util.ArrayList;

public class Seller implements Subject {

  // The list of registered Buyer observers
  private ArrayList<Observer> buyers = new ArrayList<>();
  // The list of items available for auction
  private ArrayList<Product> items = new ArrayList<>();

  /**
   * This method pushes item bid notifications to all registered buyers not
   * placing the bid. The method body calls the update function on each observer
   * object.
   * 
   * @param itemBid the item Bid to be sent out to all drivers
   */
  public void pushBid(Buyer buy, Bid itemBid) {
    for (Observer o : buyers) {
      if (!o.equals(buy)) {
        o.update(itemBid);
      }
    }
  }

  /*
   * Add a buyer to the list of observers.
   */
  public void registerBuyer(Observer observer) {
    buyers.add(observer);
  }

  /*
   * Remove a buyer from the list of observers.
   */
  public void removeBuyer(Observer observer) {
    buyers.remove(observer);
  }

  /**
   * This function gets the list of observers.
   * 
   * @return the list of observers
   */
  public ArrayList<Observer> getDrivers() {
    return buyers;
  }

  public void addItem(Product item) {
    items.add(item);
  }
}
