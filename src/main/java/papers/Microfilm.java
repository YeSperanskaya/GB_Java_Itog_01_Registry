package papers;

public class Microfilm extends Paper{
    private int lengthInSeconds;
    public Microfilm(String name, String author, int year, int lengthInSeconds) {
        super(name, author, year);
        super.type = "Microfilm";
        this.lengthInSeconds = lengthInSeconds;
    }
    public Microfilm(int inventoryNumber, String name, String author, int year, int lengthInSeconds) {
        super(inventoryNumber,name, author, year);
        super.type = "Microfilm";
        this.lengthInSeconds = lengthInSeconds;
    }

    @Override
    public String toString() {
        return super.toString() + "Длина в секундах: " + lengthInSeconds;
    }
}
