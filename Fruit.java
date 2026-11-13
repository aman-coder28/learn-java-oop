public class Fruit extends Item {
  public Fruit(Option type, int quantity) {
    super(type.name(), quantity);
  }

  @Override
  public String toString() {
    return String.format("Fruit: %s, quantity: %s.", name, quantity);
  }
}
