package pl.sages.craft.cleancode.decorator;

/**
 * @author krogulecp
 */
class HardCoverBookDecorator extends BookDecorator {
    HardCoverBookDecorator(Book book) {
        super(book);
    }

    @Override
    public String describe() {
        return super.describe() + " with hard cover";
    }
}
