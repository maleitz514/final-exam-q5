package edu.bu.met.cs665;

public class Product {
  private String itemName;

  public Product(String itemName) {
    this.itemName = itemName;
  }

  public String getBuyerId() {
    return this.itemName;
  }
}
