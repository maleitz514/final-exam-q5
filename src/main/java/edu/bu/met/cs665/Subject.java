package edu.bu.met.cs665;

public interface Subject {

  /**
   * Abstract method to push item bids to observers for a given buyer.
   * 
   * @param buy     the buyer placing the bid.
   * @param itemBid the Bid to push to observers.
   */
  void pushBid(Buyer buy, Bid itemBid);

  /**
   * Abstract method to add an Observer to the Subject.
   * 
   * @param observer the observer to add.
   */
  void registerBuyer(Observer observer);

  /**
   * Abstract method to remove an observer from the Subject.
   * 
   * @param observer the observer to remove
   */
  void removeBuyer(Observer observer);

}
