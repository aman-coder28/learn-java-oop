import java.util.UUID;

public abstract class Item {
  protected String id;
  protected String name;
  protected int quantity;

  public Item(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;

    this.id = UUID.randomUUID().toString().replaceAll("-", "");
  }

  String getName() {
    return name;
  }

  String getID() {
    return id;
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

  public abstract String displayInfo();
}
