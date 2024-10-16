package papers;

public class Book extends Paper{
    private int numberOfPages;


    public Book(String name, String author, int year, int numberOfPages) {
        super(name, author, year);
        super.type = "Book";
        this.numberOfPages = numberOfPages;
    }

    public Book(int inventoryNumber, String name, String author, int year, int numberOfPages) {
        super(inventoryNumber, name, author, year);
        super.type = "Book";
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return super.toString() +
                "количество страниц: " + numberOfPages;
    }
}
