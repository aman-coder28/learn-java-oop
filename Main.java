public class Main {
  public static void main(String[] args) {
    Inventory inventory = new Inventory();

    Item Sword = new Weapon(WeaponType.Sword, 2, 2000);
    Item Riffle = new Weapon(WeaponType.Riffle, 1, 6000);
    Item Apple = new Fruit(Option.Apple, 5);

    inventory.setItem(Sword);
    inventory.setItem(Riffle);
    inventory.setItem(Apple);

    inventory.updateItem(Sword.getID(), new Weapon(WeaponType.Riffle, 2, 10000));
    inventory.updateItem(Apple.getID(), new Weapon(WeaponType.Sword, 2, 5000));

    System.out.println(inventory);
  }
}
