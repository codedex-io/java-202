// Override 🎤

class Song {
  String title;
  String artist;
  int streams;

  void play() {
    System.out.println("Now playing a song...");
  }
}

class FeaturedSong extends Song {
  String playlist;
  // Write code here 💖
  @Override
  void play() {
    System.out.println("🔥 Now playing: " + title + " by " + artist + " from 🔊 " + playlist);
  }
}


public class Main {
  public static void main(String[] args) {
  // Do not change! 💖
  FeaturedSong hit = new FeaturedSong();
  hit.title = "Espresso";
  hit.artist = "Sabrina Carpenter";
  hit.streams = 1500000;
  hit.playlist = "Today's Top Hits";

  hit.play();
  }
}