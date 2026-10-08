// Shapeshift 🎨

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

class Circle extends Shape {
  private double radius;

  public Circle(String color, double radius) {
    super(color);
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }
}

class Rectangle extends Shape {
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
}

// Write your Triangle class here 💖
class Triangle extends Shape {
  private double base;
  private double height;

  public Triangle(String color, double base, double height) {
    super(color);
    this.base = base;
    this.height = height;
  }

  @Override
  public double area() {
    return base * height / 2;
  }
}


public class Main {
  public static void main(String[] args) {
    Shape[] canvas = {
      new Circle("pink", 3.0),
      new Rectangle("blue", 4.0, 5.0),
      // Add your Triangle here 💖
      new Triangle("gold", 6.0, 4.0),
      new Circle("mint", 1.5)
    };

    // Do not change! 💖
    for (Shape shape : canvas) {
      System.out.println("🎨 " + shape.getColor() + " | Area: " + shape.area());
    }
  }
}