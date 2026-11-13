public class Main {
  public static void main(String[] args) {
    Item sword = new Item("sword", 2);

    Inventory inventory = new Inventory();

    inventory.setItem(sword);
    inventory.setItem(new Fruit(Option.Apple, 5));

    System.out.println(inventory.getItem("Apple"));
  }
}
