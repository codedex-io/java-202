// Construction 🔒

class SecurityAlert {
  String alertType;
  int severity;
  String timestamp;

  SecurityAlert(String alertType, int severity, String timestamp) {
    this.alertType = alertType;
    this.severity = severity;
      this.timestamp = timestamp;
  }
}

// Write code here 💖
class MalwareAlert extends SecurityAlert {
  String malwareName;

  MalwareAlert(String alertType, int severity, String timestamp, String malwareName) {
    super(alertType, severity, timestamp);
    this.malwareName = malwareName;
  }
}

public class Main {
  public static void main(String[] args) {
      
    // Do not change! 💖
    MalwareAlert alert1 = new MalwareAlert("Trojan Detected", 9, "2026-05-28 11:45PM", "DarkComet");
    MalwareAlert alert2 = new MalwareAlert("Spyware Found", 7, "2026-05-28 11:50PM", "KeySniffer");

    System.out.println("⚠️ " + alert1.alertType + " | Severity: " + alert1.severity + " | " + alert1.timestamp + " | Threat: " + alert1.malwareName);
    System.out.println("⚠️ " + alert2.alertType + " | Severity: " + alert2.severity + " | " + alert2.timestamp + " | Threat: " + alert2.malwareName);
    }
}