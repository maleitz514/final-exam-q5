package edu.bu.met.cs665;

import java.util.ArrayList;

public interface Observer {

  /**
   * Abstract method used to update all observers about a new Bid on a Product.
   * 
   * @param itemBid the Bid to notify the Observers of
   */
  public void update(Bid itemBid);

  /**
   * Abstract method used to return the list of Bids stored in each Observer.
   * 
   * @return the list of Bids.
   */
  public ArrayList<Bid> getBids();

  /**
   * Abstract method used to call the update function on the Subject.
   * 
   * @param sel subject to call from
   * @param bid item to pass through
   */
  public void placeBid(Seller sel, Bid bid);
}
