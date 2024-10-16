package registry;

import papers.Paper;

import java.util.ArrayList;

public class Registry {
    ArrayList<Paper> arrayList;

    public Registry(ArrayList arrayList) {
        this.arrayList = arrayList;
    }
    public Registry() {
        this.arrayList = new ArrayList<>();
    }

    public void add(Paper paper) {
        if(arrayList.contains(paper)) {
            System.out.println("Объект с такми инвентарным номером уже есть в библиотеке!");
        } else {
            arrayList.add(paper);
            System.out.println(paper + " успешно добавлен в библиотеку!");
        }
    }

    private ArrayList find(int inventoryNumber) {
        ArrayList arrayFind = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            int existInventoryNumber = arrayList.get(i).getInventoryNumber();
            if (existInventoryNumber == inventoryNumber) {
                arrayFind.add(arrayList.get(i));
            }
        }
        return arrayFind;
    }
    private ArrayList find(String author) {
        ArrayList arrayFind = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            String existAuthor = arrayList.get(i).getAuthor();
            if (existAuthor.equals(author)) {
                arrayFind.add(arrayList.get(i));
            }
        }
        return arrayFind;
    }

    public void findPaper(int inventoryNumber) {
        print(find(inventoryNumber));
    }
    public void findPaper(String author) {
        print(find(author));
    }

    public void print(ArrayList array) {
        if (array.isEmpty()) {
            System.out.println("Объекты не найдены!");
        } else {
            System.out.println("Найдены следующие объекты: ");
            for (int i = 0; i < array.size(); i++) {
                System.out.println(array.get(i));
            }
        }
    }

    public void print() {
        print(arrayList);
    }




}
