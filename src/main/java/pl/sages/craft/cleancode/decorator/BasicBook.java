package pl.sages.craft.cleancode.decorator;

/**
 * @author krogulecp
 */
class BasicBook implements Book {
    @Override
    public String describe() {
        return "Book";
    }
}
