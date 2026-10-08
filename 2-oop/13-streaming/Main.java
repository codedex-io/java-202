// Streaming 🎥

// Write your Content class here 💖
abstract class Content {
  private String title;
  private int progress;

  public Content(String title) {
    this.title = title;
    this.progress = 0;
  }

  public String getTitle() {
    return title;
  }

  public int getProgress() {
    return progress;
  }

  public void setProgress(int progress) {
    if (progress > 100) {
      this.progress = 100;
    } else if (progress < 0) {
      this.progress = 0;
    } else {
      this.progress = progress;
    }
  }

  public abstract void play();
}

// Write your Downloadable interface here 💖
interface Downloadable {
  void download();
}

// Write your Movie class here 💖
class Movie extends Content implements Downloadable {

  public Movie(String title) {
    super(title);
  }

  @Override
  public void play() {
    System.out.println("🎬 Playing movie: " + getTitle() + " — " + getProgress() + "% watched");
  }

  @Override
  public void download() {
    System.out.println("⬇️ " + getTitle() + " saved for offline!");
  }
}

// Write your LiveStream class here 💖
class LiveStream extends Content {

  public LiveStream(String title) {
    super(title);
  }

  @Override
  public void play() {
    System.out.println("🔴 LIVE: " + getTitle());
  }
}


public class Main {
  public static void main(String[] args) {
    // Do not change! 💖
    Movie inception = new Movie("Inception");
    LiveStream finals = new LiveStream("NBA Finals");

    inception.setProgress(45);

    Content[] library = { inception, finals };

    for (Content item : library) {
      item.play();
    }

    System.out.println();

    inception.setProgress(150);
    System.out.println("📊 Progress: " + inception.getProgress() + "%");

    inception.setProgress(-10);
    System.out.println("📊 Progress: " + inception.getProgress() + "%");

    System.out.println();

    Downloadable offline = inception;
    offline.download();
  }
}