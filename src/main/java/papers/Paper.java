package papers;

import java.util.Objects;
import java.util.Random;

public abstract class Paper {
    protected int inventoryNumber;
    protected String name;
    protected String author;
    protected int year;
    protected String type;

    public Paper(String name, String author, int year) {
        this.inventoryNumber = createInventoryNumber();
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public Paper(int inventoryNumber, String name, String author, int year) {
        this.inventoryNumber = inventoryNumber;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    private int createInventoryNumber() {
        Random random = new Random();
        int inventoryNumberLength = 8;
        int maxNumber = (int) Math.pow(10, inventoryNumberLength) - 1;
        return random.nextInt(maxNumber) + 1;
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paper paper = (Paper) o;
        return inventoryNumber == paper.inventoryNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(inventoryNumber);
    }

    @Override
    public String toString() {
        return "Инвентарный номер: " + inventoryNumber +
                ", наименование: " + name +
                ", автор: " + author +
                ", год: " + year +
                ", тип: " + type + ", ";
    }
}
