// Guardrails 🛠️

class Speaker {
  private int volume;
  private int timesPlayed;

  // Write your methods here 💖
  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if (volume > 10) {
      this.volume = 10;
    } else if (volume < 0) {
      this.volume = 0;
    } else {
      this.volume = volume;
    }
  }

  public int getTimesPlayed() {
    return timesPlayed;
  }

  public void play() {
    timesPlayed++;
    System.out.println("🎵 Playing!");
  }
}


public class Main {
  public static void main(String[] args) {
    // Do not change! 💖
    Speaker deskSpeaker = new Speaker();

    deskSpeaker.setVolume(15);
    System.out.println("🔊 Volume: " + deskSpeaker.getVolume());

    deskSpeaker.setVolume(-3);
    System.out.println("🔊 Volume: " + deskSpeaker.getVolume());

    deskSpeaker.setVolume(7);
    System.out.println("🔊 Volume: " + deskSpeaker.getVolume());

    deskSpeaker.play();
    deskSpeaker.play();

    System.out.println("▶️ Times played: " + deskSpeaker.getTimesPlayed());
  }
}