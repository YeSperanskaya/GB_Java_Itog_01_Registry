package papers;

public class Microfilm extends Paper{
    private int lengthInSeconds;
    public Microfilm(String name, String author, int year, String type, int lengthInSeconds) {
        super(name, author, year, type);
        this.lengthInSeconds = lengthInSeconds;
    }

    @Override
    public String toString() {
        return super.toString() + "Длина в секундах: " + lengthInSeconds;
    }
}
