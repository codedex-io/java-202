// Mixer 🎨

interface Drawable {
  void draw();
}

abstract class Shape {
  private String color;

  public Shape(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public abstract double area();
}

class Circle extends Shape implements Drawable {
  private double radius;

  public Circle(String color, double radius) {
    super(color);
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }

  @Override
  public void draw() {
    System.out.println("⭕ Drawing a " + getColor() + " circle!");
  }
}

class Rectangle extends Shape implements Drawable {
  private double width;
  private double height;

  public Rectangle(String color, double width, double height) {
    super(color);
    this.width = width;
    this.height = height;
  }

  @Override
  public double area() {
    return width * height;
  }

  @Override
  public void draw() {
    System.out.println("🟦 Drawing a " + getColor() + " rectangle!");
  }
}

class TextLabel implements Drawable {
  private String text;

  public TextLabel(String text) {
    this.text = text;
  }

  @Override
  public void draw() {
    System.out.println("🔤 Rendering: " + text);
  }
}

// Write your Icon class here 💖
class Icon implements Drawable {
  private String symbol;
  private String name;

  public Icon(String symbol, String name) {
    this.symbol = symbol;
    this.name = name;
  }

  @Override
  public void draw() {
    System.out.println(symbol + " Icon: " + name);
  }
}


public class Main {
  public static void main(String[] args) {
    Drawable[] canvas = {
      new Circle("pink", 3.0),
      new Rectangle("blue", 4.0, 5.0),
      new TextLabel("My Masterpiece ✨"),
      // Add your Icon here 💖
      new Icon("🎨", "paintbrush")
    };

    // Do not change! 💖
    for (Drawable item : canvas) {
      item.draw();
    }
  }
}