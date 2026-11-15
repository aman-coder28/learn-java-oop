public class Weapon extends Item {
  private int hitpoint;

  public Weapon(WeaponType type, int quantity, int hitpoint) {
    super(type.name(), quantity);

    this.hitpoint = hitpoint;
  }

  @Override
  public String displayInfo() {
    return String.format("Weapon: %s, Hitpoint: %s, quantity: %s.", name, hitpoint, quantity);
  }
}
