package pl.sages.craft.cleancode.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author krogulecp
 */
class BookUser {

    public static void main(String[] args) {
        Book book = () -> "Book";

        // Usunięto dekoratory, dzięki funkcjonanlności JAVA 8 nie były w tym przypadku konieczne.
//        FictionBookDecorator fictionBookDecorator = new FictionBookDecorator(book);
//        HardCoverBookDecorator hardCoverBookDecorator = new HardCoverBookDecorator(book);
//        ScienceBookDecorator scienceBookDecorator = new ScienceBookDecorator(book);
//        HardCoverBookDecorator scienceHardCoveredBook = new HardCoverBookDecorator(scienceBookDecorator);

        Book fictionBookDecorator = () -> "Fiction " + book.describe();
        Book hardCoverBookDecorator = () -> book.describe() + " with hard cover";
        Book scienceBookDecorator = () -> "Science " + book.describe();
        Book scienceHardCoveredBook =  () -> scienceBookDecorator.describe() + " with hard cover";


        List<Book> books = new ArrayList<>();
        books.add(fictionBookDecorator);
        books.add(hardCoverBookDecorator);
        books.add(scienceBookDecorator);
        books.add(scienceHardCoveredBook);

        books.forEach(b -> System.out.println(b.describe()));


    }
}
