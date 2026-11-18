public class Weapon extends Item {
  private int hitpoint;

  public Weapon(WeaponType type, int quantity, int hitpt) {
    super(type.name(), quantity);

    hitpoint = hitpt;
  }

  @Override
  public String displayInfo() {
    return String.format("Weapon: %s, Hitpoint: %s, quantity: %s.", name, hitpoint, quantity);
  }
}
