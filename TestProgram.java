public class TestProgram {
    public static void main(String[] args) {

        Student student = new Student("Juan Dela Cruz");

        LibraryResource book = new Book("Java Programming");
        LibraryResource journal = new Journal("AI Research");
        LibraryResource audioBook = new AudioBook("Clean Code Audio");

        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(audioBook);
    }
}