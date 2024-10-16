package papers;

public class Book extends Paper{
    private int numberOfPages;


    public Book(String name, String author, int year, int numberOfPages, String type) {
        super(name, author, year, type);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return super.toString() +
                "количество страниц: " + numberOfPages;
    }
}
