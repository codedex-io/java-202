// Multileveling 🔔

class Notification {
  String message;
  String timestamp;

  Notification(String message, String timestamp) {
    this.message = message;
    this.timestamp = timestamp;
  }
}

class PushNotification extends Notification {
  String appName;

  PushNotification(String message, String timestamp, String appName) {
    super(message, timestamp);
    this.appName = appName;
  }
}

// Write code here 💖
class UrgentNotification extends PushNotification {
  int priority;

  UrgentNotification(String message, String timestamp, String appName, int priority) {
    super(message, timestamp, appName);
    this.priority = priority;
  }
}

public class Main {
  public static void main(String[] args) {
    // Write code here 💖
    UrgentNotification alert = new UrgentNotification("Server is down!", "2026-05-28 11:30PM", "PagerDuty", 1);

    // Do not change! 💖
    System.out.println("🔔 " + alert.appName + " [Priority: " + alert.priority + "]");
    System.out.println("📨 " + alert.message);
    System.out.println("🕐 " + alert.timestamp);
  }
}