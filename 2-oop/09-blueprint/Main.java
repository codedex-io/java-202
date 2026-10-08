// Blueprint 📝

// Write your Pokemon class here 💖
abstract class Pokemon {
  private String name;
  private int level;

  Pokemon(String name, int level) {
    this.name = name;
    this.level = level;
  }

  public String getName() {
    return name;
  }

  public int getLevel() {
    return level;
  }

  public void levelUp() {
    level++;
  }

  public abstract String getType();

  public abstract String useMove();
}

// Write your Squirtle class here 💖
class Squirtle extends Pokemon {

  Squirtle(String name, int level) {
    super(name, level);
  }

  @Override
  public String getType() {
    return "Water";
  }

  @Override
  public String useMove() {
    return getName() + " used Water Gun!";
  }
}


public class Main {
  public static void main(String[] args) {
    // Do not change! 💖
    Squirtle bubbles = new Squirtle("Bubbles", 5);

    System.out.println("⚡ " + bubbles.getName() + " | Type: " + bubbles.getType() + " | Level: " + bubbles.getLevel());
    System.out.println("💧 " + bubbles.useMove());

    bubbles.levelUp();
    System.out.println("📈 " + bubbles.getName() + " is now level " + bubbles.getLevel() + "!");
  }
}