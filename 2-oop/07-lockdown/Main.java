// Lockdown 🔐

class Lock {
  private String doorName;
  private boolean isLocked;

  // Write your getters and setters here 💖
  public String getDoorName() {
    return doorName;
  }

  public void setDoorName(String doorName) {
    this.doorName = doorName;
  }

  public boolean getIsLocked() {
    return isLocked;
  }

  public void setIsLocked(boolean isLocked) {
    this.isLocked = isLocked;
  }
}

// Write your SmartLock class here 💖
class SmartLock extends Lock {
  String currentLockStatus;
}


public class Main {
  public static void main(String[] args) {
    // Nothing to do here! 💖
  }
}