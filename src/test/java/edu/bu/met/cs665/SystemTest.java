package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

// Write some Unit tests for your program like the following.

public class SystemTest {

  @Test
  public void testAuctionSystem() {
    AuctionSystem as = new AuctionSystem();

    // Create the buyers
    int buyerId_1 = 1;
    int buyerId_2 = 2;

    Observer buyer_1 = new Buyer(buyerId_1);
    Observer buyer_2 = new Buyer(buyerId_2);

    // Create the Seller
    Seller seller = new Seller();

    // Create the Product
    Product newProduct = new Product("TV Stand");
    seller.addItem(newProduct);

    // Create the Bid
    Bid bid_1 = new Bid(newProduct);

    // Add buyers and bid
    seller.registerBuyer(buyer_1);
    seller.registerBuyer(buyer_2);

    buyer_1.placeBid(seller, bid_1);

    // The first buyer placed the bid, they should have no bids in their queue
    // The second buyer was notified of the first buyer's bid
    assertEquals(0, buyer_1.getBids().size());
    assertEquals(1, buyer_2.getBids().size());
    assertTrue(buyer_2.getBids().contains(bid_1));
  }
}