package papers;

public class Letter extends Paper{
    private String addressee;
    public Letter(String name, String author, int year, String type, String addressee) {
        super(name, author, year, type);
        this.addressee = addressee;
    }

    @Override
    public String toString() {
        return super.toString() + "Адресат: " + addressee;
    }
}
