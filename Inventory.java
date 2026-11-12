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
    items.remove(items.indexOf(getItem(name)));
  }

  void updateItem(String name, Item ittem) {
    var item = items.stream().filter(x -> name.equals(getItem(name).getName())).findFirst();

    item.get().setQuantity(ittem.getQuantity());
    item.get().setName(ittem.getName());
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
