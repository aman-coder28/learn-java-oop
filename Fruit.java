public class Fruit extends Item {
  public Fruit(Option type, int quantity) {
    String name = setType(type);

    super(name, quantity);
  }

  private static String setType(Option type) {
    switch (type) {
      case Apple:
        return "Apple";
      case Banana:
        return "Banana";
      case Orange:
        return "Orange";
      default:
        return "Avocado";
    }
  }
}
