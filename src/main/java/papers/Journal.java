package papers;

public class Journal extends Paper{
    private int numberOfArticles;
    public Journal(String name, String author, int year, int numberOfArticles) {
        super(name, author, year);
        super.type = "Journal";
        this.numberOfArticles = numberOfArticles;
    }
    public Journal(int inventoryNumber, String name, String author, int year, int numberOfArticles) {
        super(inventoryNumber, name, author, year);
        super.type = "Journal";
        this.numberOfArticles = numberOfArticles;
    }

    @Override
    public String toString() {
        return super.toString() + "Количество статей: " + numberOfArticles;
    }
}
