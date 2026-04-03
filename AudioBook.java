public class AudioBook implements LibraryResource {
    private String title;

    public AudioBook(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void borrow() {
        System.out.println("Borrowing audiobook: " + title);
    }
}