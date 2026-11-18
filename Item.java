import java.util.UUID;

public abstract class Item {
  protected String id;
  protected String name;
  protected int quantity;

  public Item(String n, int q) {
    name = n;
    quantity = q;

    id = UUID.randomUUID().toString().replaceAll("-", "");
  }

  String getName() {
    return name;
  }

  String getID() {
    return id;
  }

  void setName(String n) {
    name = n;
  }

  int getQuantity() {
    return quantity;
  }

  void setQuantity(int q) {
    quantity = q;
  }

  public abstract String displayInfo();
}
