package papers;

public class Letter extends Paper{
    private String addressee;
    public Letter(String name, String author, int year, String addressee) {
        super(name, author, year);
        super.type = "Letter";
        this.addressee = addressee;
    }

    public Letter(int inventoryNumber, String name, String author, int year, String addressee) {
        super(inventoryNumber, name, author, year);
        super.type = "Letter";
        this.addressee = addressee;
    }

    @Override
    public String toString() {
        return super.toString() + "Адресат: " + addressee;
    }
}
