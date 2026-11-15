public class Main {
  public static void main(String[] args) {
    Inventory inventory = new Inventory();

    inventory.setItem(new Weapon(WeaponType.Sword, 2, 2000));
    inventory.setItem(new Fruit(Option.Apple, 5));

    inventory.updateItem("sword", new Item("Sword", 3));

    System.out.println(inventory);
  }
}
