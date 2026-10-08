// Socials 📱

// Write code here 💖
class Post {
  protected String username;
  protected String content;
  protected int likes;

  Post(String username, String content, int likes) {
    this.username = username;
    this.content = content;
    this.likes = likes;
  }

  void display() {
    System.out.println("📝 " + username + ": " + content + " - ❤️ " + likes + " likes");
  }
}

class MediaPost extends Post {
  protected String mediaType;

  MediaPost(String username, String content, int likes, String mediaType) {
    super(username, content, likes);
    this.mediaType = mediaType;
  }

  @Override
  void display() {
    System.out.println("📸 " + username + " posted a " + mediaType + ": " + content + " - ❤️ " + likes + " likes");
  }
}

class Story extends MediaPost {
  protected int duration;
  private int viewCount;

  Story(String username, String content, int likes, String mediaType, int duration) {
    super(username, content, likes, mediaType);
    this.duration = duration;
    this.viewCount = 0;
  }

  public int getViewCount() {
    return viewCount;
  }

  public void watch() {
    viewCount++;
  }

  @Override
  void display() {
    System.out.println("⏳ " + username + "'s Story (" + mediaType + ", " + duration + "s): " + content + " - ❤️ " + likes + " likes - 👀 " + viewCount + " views");
  }
}

public class Main {
  public static void main(String[] args) {
    // Do not change! 💖
    Post text = new Post("alex", "Just had the best coffee ☕", 42);
    MediaPost photo = new MediaPost("jordan", "Sunset at the beach", 128, "Photo");
    Story story = new Story("robin", "Behind the scenes 🎬", 89, "Video", 15);

    text.display();
    photo.display();
    story.display();


    story.watch();
    story.watch();
    story.watch();
    story.display();
    System.out.println("Total views: " + story.getViewCount());

    // Write code here 💖
    MediaPost clip = new MediaPost("sam", "First kickflip 🛹", 57, "Video");
    clip.display();
    
  }
}