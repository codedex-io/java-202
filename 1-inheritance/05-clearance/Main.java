// Clearance 🔒

class FileItem {
  protected String fileName;
  private int fileSize;
  protected String owner;

  FileItem(String fileName, int fileSize, String owner) {
    this.fileName = fileName;
    this.fileSize = fileSize;
    this.owner = owner;
  }

  public int getFileSize() {
    return fileSize;
  }
}

class SharedFile extends FileItem {
  public String sharedWith;

  SharedFile(String fileName, int fileSize, String owner, String sharedWith) {
    super(fileName, fileSize, owner);
    this.sharedWith = sharedWith;
  }

  void showDetails() {
    System.out.println("📁 " + fileName + " | Owner: " + owner + " | Shared with: " + sharedWith + " | Size: " + getFileSize() + "KB");
  }
}

public class Main {
  public static void main(String[] args) {
    SharedFile doc = new SharedFile("project_plan.pdf", 2048, "Roger", "Team");
    doc.showDetails();
  }
}