package edu.bu.met.cs665;

public class Bid {

  // Metadata for the Bid.
  private Product item;

  /**
   * Constructor for a Bid object that holds the item that was bid on.
   * 
   * @param itemBidOn item that was bid on.
   *
   */
  public Bid(Product itemBidOn) {
    this.item = itemBidOn;
  }

  public Product getItem() {
    return this.item;
  }

}
