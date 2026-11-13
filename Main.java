public class Main {
  public static void main(String[] args) {
    Inventory inventory = new Inventory();

    inventory.setItem(new Item("sword", 2));
    inventory.setItem(new Fruit(Option.Apple, 5));

    inventory.updateItem("sword", new Item("Sword", 3));

    System.out.println(inventory);

    inventory.removeItem("Sword");

    System.out.println(inventory);
  }
}
