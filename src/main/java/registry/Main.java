package registry;

import papers.Book;
import papers.Journal;
import papers.Letter;
import papers.Microfilm;

import java.util.Random;

/**
 * Вы реализуете библиотечный реестр - абстракция предназначенная для описания библиотечного фонда муниципалитета
 * вашего города. В этом фонде хранятся разные объекты: книги, журналы, письма, микрофильмы и т.д.
 * Также вам необходимо будет реализовать сервис обеспечивающий поиск среди всех объектов по инвентарному
 * номеру и/или автору. Ваш main класс должен инициализировать реестр (генерировать экземпляры объектов),
 * инициализировать сервис поиска и выводить на экран найденные элементы.
 * Требования к сдаче:
 * При создании решения постарайтесь воспользоваться принципами Наследование,
 *
 * Полиморфизма, Инкапсуляции. используйте абстрактные классы и интерфейсы.
 */
public class Main {
    public static void main(String[] args) {
        Book book = new Book(1, "Ton", "Пушкин", 1835, 25);
        Journal journal = new Journal(2, "Наука и жизнь", "Shildt", 2024, 6);
        Letter letter = new Letter(3, "about work", "Masha", 2023, "Pete");
        Microfilm microfilm = new Microfilm(4,"IOS", "Masha", 2001, 30);

        Registry registry = new Registry();
        registry.add(book);
        registry.add(journal);
        registry.add(letter);
        registry.add(microfilm);

        System.out.println("Вывод на печать всех имеющихся объектов: ");
        registry.print();
        System.out.println();

        System.out.println("Поиск по автору Masha");
        registry.findPaper("Masha");
        System.out.println();
        System.out.println("Поиск по автору Pit");
        registry.findPaper("Pit");
        System.out.println();

        System.out.println("Поиск по инвернатрому номеру 2");
        registry.findPaper(2);
        System.out.println();
        System.out.println("Поиск по несуществующему инвернатрому номеру 9");
        registry.findPaper(9);
        System.out.println();


    }
}