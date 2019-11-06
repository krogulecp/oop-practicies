package pl.sages.craft.cleancode.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author krogulecp
 */
class BookUser {

    public static void main(String[] args) {
        BasicBook book = new BasicBook();

        Book fictionBookDecorator = new FictionBookDecorator() ->;
        Book hardCoverBookDecorator = new HardCoverBookDecorator(book);
        Book scienceBookDecorator = new ScienceBookDecorator(book);
        Book scienceHardCoveredBook = new HardCoverBookDecorator(scienceBookDecorator);

        List<Book> books = new ArrayList<>();
        books.add(fictionBookDecorator);
        books.add(hardCoverBookDecorator);
        books.add(scienceBookDecorator);
        books.add(scienceHardCoveredBook);

        books.forEach(b -> System.out.println(b.describe()));


    }
}
