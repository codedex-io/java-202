// Extends 🐉

class Creature {
  String name;
  int health;
  String habitat;
}

// Write code here 💖
class Dragon extends Creature {
  String element;
  boolean canFly;
}

public class Main {
  public static void main(String[] args) {
    
    // Do not change! 💖
    Dragon ember = new Dragon();
    ember.name = "Ember";
    ember.health = 100;
    ember.habitat = "Volcano";
    ember.element = "Fire";
    ember.canFly = true;

    System.out.println("Name: " + ember.name);
    System.out.println("Health: " + ember.health);
    System.out.println("Habitat: " + ember.habitat);
    System.out.println("Element: " + ember.element);
    System.out.println("Can Fly: " + ember.canFly);
  }
}