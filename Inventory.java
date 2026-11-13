import java.util.ArrayList;

public class Inventory {
  private ArrayList<Item> items;

  public Inventory() {
    items = new ArrayList<Item>();
  }

  ArrayList<Item> getItems() {
    return items;
  }

  Item getItem(String name) {
    return items.stream().filter(x -> name.equals(x.getName())).findFirst().orElse(null);
  }

  void setItem(Item item) {
    items.add(item);
  }

  void removeItem(String name) {
    items.removeIf(x -> x.getName().equals(name));
  }

  void updateItem(String name, Item ittem) {
    Item item = getItem(name);

    if (item == null)
      return;

    item.setQuantity(ittem.getQuantity());
    item.setName(ittem.getName());
  }

  @Override
  public String toString() {
    String str = "";

    for (Item item : items) {
      str += String.format("%s, %d \n", item.getName(), item.getQuantity());
    }

    return str;
  }
}
