package edu.bu.met.cs665;

import java.util.ArrayList;

public class Buyer implements Observer {

  private int buyerId;
  private ArrayList<Bid> itemBids = new ArrayList<>();

  /**
   * Constructor for a Buyer object. A Buyer is identified using their buyerId
   * number.
   * 
   * @param idNumber the Buyer's buyer identification number.
   */
  public Buyer(int idNumber) {
    this.buyerId = idNumber;
  }

  /**
   * This method adds the Bid items to the list for the Buyer to keep track of.
   * 
   * @param itemBid the Bid to add to the Buyer's list.
   */
  public void update(Bid itemBid) {
    itemBids.add(itemBid);
  }

  /**
   * A getter for the list of Bids that this Buyer received.
   * 
   * @return The list of Bids.
   */
  public ArrayList<Bid> getBids() {
    return this.itemBids;
  }

  public void placeBid(Seller seller, Bid toBid) {
    seller.pushBid(this, toBid);
  }
  
  public int getBuyerId() {
    return this.buyerId;
  }
}
