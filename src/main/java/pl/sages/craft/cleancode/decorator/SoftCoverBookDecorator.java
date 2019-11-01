package pl.sages.craft.cleancode.decorator;

/**
 * @author krogulecp
 */
class SoftCoverBookDecorator extends BookDecorator {
    SoftCoverBookDecorator(Book book) {
        super(book);
    }

    @Override
    public String describe() {
        return super.describe() + " with soft cover";
    }
}
