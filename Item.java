public class Item {
  protected String name;
  protected int quantity;

  public Item(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  String getName() {
    return name;
  }

  void setName(String name) {
    this.name = name;
  }

  int getQuantity() {
    return quantity;
  }

  void setQuantity(int q) {
    this.quantity = q;
  }

  @Override
  public String toString() {
    return String.format("%s, quantity: %d.", name, quantity);
  }
}
