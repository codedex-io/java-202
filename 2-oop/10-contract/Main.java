// Contract 📄

// Write your Clickable interface here 💖
interface Clickable {
  String click();
}

// Write your Button class here 💖
class Button implements Clickable {
  private String label;

  Button(String label) {
    this.label = label;
  }

  @Override
  public String click() {
    return label + " clicked!";
  }
}


public class Main {
  public static void main(String[] args) {
    // Do not change! 💖
    Button submit = new Button("Submit");

    System.out.println("🖱️ " + submit.click());
  }
}