package papers;

public class Journal extends Paper{
    private int numberOfArticles;
    public Journal(String name, String author, int year, String type, int numberOfArticles) {
        super(name, author, year, type);
        this.numberOfArticles = numberOfArticles;
    }

    @Override
    public String toString() {
        return super.toString() + "Количество статей: " + numberOfArticles;
    }
}
